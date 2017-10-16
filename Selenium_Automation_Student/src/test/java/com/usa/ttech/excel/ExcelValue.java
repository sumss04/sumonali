package com.usa.ttech.excel;
import com.usa.excel.util.ExcelColumnArray;

public class ExcelValue {

	static String excelPath="./DataExtract.xlsx";
	
	public static void main(String[] args) throws Exception {
		ExcelColumnArray.columnValue(excelPath, 0, 0);
		
		
	}

}
