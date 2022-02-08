package com.organisation1.MyProject.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtil {
	WebDriver driver;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	
	public ExcelUtil(WebDriver driver) {
		this.driver=driver;		
	}
	
	public static int getLastRowNumber(String TestDataPath, String SheetName) throws IOException
	{
		FileInputStream fp=new FileInputStream(TestDataPath);
		workbook=new XSSFWorkbook(fp);
		sheet=workbook.getSheet(SheetName);
		int i =sheet.getLastRowNum();
		return i;
	}
	
	public static String getData(int row, int col) {
		cell=sheet.getRow(row).getCell(col);
		String cellData=cell.getStringCellValue();
		return cellData;
	}


}
