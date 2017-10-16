package com.usa.ttech.student1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.aspose.cells.ListObject;
import com.aspose.cells.Range;
import com.aspose.cells.TableStyleType;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Database {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl", "hr", "hr");
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("\r\n" + 
				"Select * From (select employee_id,first_name,last_name,salary, DENSE_RANK() over(ORDER BY salary desc)  rank from employees) Where rank= 9");

		Workbook workbook = new Workbook();
		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Import the ResultSet to the worksheet.
		worksheet.getCells().importResultSet(rs, "A1", true);

		worksheet.autoFitColumns();

		Range range = worksheet.getCells().getMaxDisplayRange();
		int tcol = range.getColumnCount();
		int trow = range.getRowCount();

		ListObject listObject = worksheet.getListObjects().get(worksheet.getListObjects().add("A1", "K109", true));

		// Adding Default Style to the table
		listObject.setTableStyleType(TableStyleType.TABLE_STYLE_MEDIUM_6);

		// Show Total
		listObject.setShowTotals(true);
		// Save the excel file.
		workbook.save(".//DataExtract.xlsx");

		// step5 close the connection object
		connection.close();

	}

}





















 /** ArrayList<String> salary = new ArrayList<String>();
 * 
 * while(rs.next()) { //
 * System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
 * +"  "+rs.getString(4)+"  "+rs.getString(5));
 * 
 * 
 * salary.add( rs.getString("SALARY")); }
 * 
 * for(String rank:salary) { System.out.println("Rank 9th salary is ::"+rank);
 * if (rank.equalsIgnoreCase("11000")) { System.out.println("Test is Passed");
 * 
 * } else { System.out.println("Test Failed");
 * 
 * } break; }*/
 
