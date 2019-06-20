package com.syntax.lsu.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtility {
	/*
	 * 
	 * 
	 * 
	 */
	
	//Connect the workbook using FileInputStream
	//Access the workbook
	//specify the sheet
	//specify the row.
	//specify last cell with values and then loop through cells.
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	
	@Test
	public void readExcelData() throws IOException {
		fis=new FileInputStream("src/test/resources/test-data/exceldata.xlsx");
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows][col];
		
		for (int i = 1; i < rows; i++) {
			
			for (int j = 0; j < col; j++) {
				
				String values=sheet.getRow(i).getCell(j).toString();
				data[i][j]=values;
				System.out.print(values+"  ");
				
			}
			System.out.println();
			
		};
		workbook.close();
	}

}
