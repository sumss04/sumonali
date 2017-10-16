/*package com.usa.ttech.student.automation;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.CellsHelper;
import com.aspose.cells.FindOptions;
import com.aspose.cells.LookAtType;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Browser_Firefox_Student {
	
	static String val1;
	//static Cell cell;
	
	
	public static void main(String[] args) throws Exception {
		Workbook workbook = new Workbook("./DataExtract.xlsx");
		
		Worksheet sheet = workbook.getWorksheets().get(0);
		Cells cells=sheet.getCells();
		
		FindOptions findOptions = new FindOptions();
		 
		//Finding the cell containing a string value that starts with "Or"
		findOptions.setLookAtType(LookAtType.START_WITH);
		 
		Cell cell = cells.find("Raphaely",null,findOptions);
		 
		//Printing the name of the cell found after searching worksheet
		System.out.println("Name of the cell containing String: " + cell.getRow());
		System.out.println("Name of the cell containing String: " + cell.getColumn());
		System.out.println("Name of the cell containing String: " + cell.getName());
	}*/


