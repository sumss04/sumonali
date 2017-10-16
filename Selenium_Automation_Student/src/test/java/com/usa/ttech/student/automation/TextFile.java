package com.usa.ttech.student.automation;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.Workbook;

public class TextFile {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\sarow\\Desktop\\TTech Teaching\\text file.txt";
		// Creating and TAB_DELIMITED LoadOptions object
		LoadOptions loadOptions5 = new LoadOptions(FileFormatType.ASPOSE_PDF     );

		// Creating an Workbook object with Tab Delimited text file path and the
		// loadOptions object
		Workbook workbook7 = new Workbook(path, loadOptions5);

		// Print message
		System.out.println("Tab Delimited workbook has been opened successfully.");
		workbook7.save("./text.xls");
	}

}
