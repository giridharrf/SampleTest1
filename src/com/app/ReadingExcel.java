package com.app;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Shammi_SeliniumClass\\123.xlsx");
		
		FileInputStream fis =new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		System.out.println(sh.getSheetName());
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		
		
		
		
	}

}
