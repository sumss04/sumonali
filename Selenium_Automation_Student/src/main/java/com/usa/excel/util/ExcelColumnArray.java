package com.usa.excel.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelColumnArray {

	public static ArrayList<String> columnValue(String excelPath,int columnNumber,int sheetNumber) throws Exception {
		//String excelPath="./DataExtract.xlsx";
		FileInputStream file= new FileInputStream(excelPath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(sheetNumber);

		ArrayList<String> columnValue= new ArrayList<String>();
		//int columnNumber=0;
		
		int RowCount= sheet.getLastRowNum();
		for(int rowindex=0;rowindex<RowCount;rowindex++) {
			Row row=sheet.getRow(rowindex);
			if (row!=null) {
		for(int colmindex=0;colmindex<RowCount;colmindex++) {	
			if(colmindex==columnNumber) {
				Cell cell=row.getCell(colmindex);
				if(cell!=null) {
					
					DataFormatter df= new DataFormatter();
					columnValue.add(df.formatCellValue(cell));
				}
				
			}
		}
		
	}
	}
	
				System.out.println(columnValue);
				return columnValue;
				
	}			

}
