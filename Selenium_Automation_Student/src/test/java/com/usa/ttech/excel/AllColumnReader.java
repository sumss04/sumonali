package com.usa.ttech.excel;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllColumnReader {

	static String excelPath="./DataExtract.xlsx";
	
	public static void main(String[] args) throws Exception {
		
		 try {
			 FileInputStream ExcelFileToRead = new FileInputStream(excelPath);
	       
			 
			 
			 XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);

	        XSSFWorkbook test = new XSSFWorkbook(); 

	        XSSFSheet sheet = wb.getSheetAt(0);
	        XSSFRow row; 
	        XSSFCell cell;

	        Iterator rows = sheet.rowIterator();

	        while (rows.hasNext())
	        {
	            row=(XSSFRow) rows.next();
	            Iterator cells = row.cellIterator();
	            while (cells.hasNext())
	            {
	                cell=(XSSFCell) cells.next();

	                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
	                {
	                    System.out.print(cell.getStringCellValue()+" ");
	                }
	                else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
	                {
	                    System.out.print(cell.getNumericCellValue()+" ");
	                }
	                else
	                {
	                    //U Can Handel Boolean, Formula, Errors
	                }
	                
	            }
	        } 
		 }catch (Exception e) {

	            throw (e);

	        }
	            System.out.println();
  
		 }
}