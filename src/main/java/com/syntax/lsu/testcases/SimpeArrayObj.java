package com.syntax.lsu.testcases;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpeArrayObj {
	//XSSFWorkbook: Represents workbook in xlsx file.
	//HSSFWorkbook: Represents workbook in xls file.
	//XSSFSheet: Represents a sheet in XLSX file.
	//HSSFSheet: Represents a sheet in XLS file.
	//XSSFRow: Represents a row in a sheet of XLSX file.
	//HSSFRow: Represents a row in a sheet of XLS file.
	//XSSFCell: Represents a cell in a row of XLSX file.
	//HSSFCell: Represents a cell in a row of XLS file.

	
	@Test(dataProvider="getData")
	public void arrayData(String uName,String pass) {
		XSSFWorkbook workbook=new XSSFWorkbook();//XML Spread Sheet Format.
		
		
	}
	
	@DataProvider()
	public Object[][] getData() {
		return ConstantsArray.getArrayData();
		
	}
	
//	@DataProvider()
//	public Object[][] getData() {
//		
//		Object[][] data=new Object[2][2];
//		//1st Row
//		data[0][0]="UserName";
//		data[0][1]="password";
//		//2nd Row
//		data[1][0]="userName1";
//		data[1][1]="password2";
//		data[2][1]="password3";
//		return data;
//	}
	
}
