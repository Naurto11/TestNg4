package org.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner1 extends BaseClass {

	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() throws InterruptedException {

		Thread.sleep(7000);
		closebrowser();

	}

	@BeforeMethod

	public void startsTime() throws InterruptedException {

		passUrl("http://192.168.1.111:8085/JMSRS/jmslogin.php");

	}

	@AfterMethod

	public void endsTime() throws InterruptedException {

		Thread.sleep(7000);

	}

	@Test
	private void write() throws IOException, InterruptedException {

		LoginPojo login = new LoginPojo();
	//	System.out.println("Suresh before" + excelRead(1, 4));
		for (int i = 1; i < 7; i++) {
			// System.out.println(i);
			System.out.println(excelRead(i, 3));
			System.out.println(excelRead(i, 4));
			//

			toInput(login.getUserid(), excelRead(i, 3));
			toInput(login.getPassword(), excelRead(i, 4));
			Thread.sleep(1000);
			btnClick(login.getPressBtn());

			if (i != 6) {

				driver.navigate().refresh();

			}
		}

	}

	@Test
	private void writeExcel() throws IOException {
	

	String path = "C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\data\\JMSA.xlsx";
	FileInputStream fis = new FileInputStream(path);
	Workbook workbook = new XSSFWorkbook(fis);
	Sheet sheet = workbook.getSheetAt(0);
	int lastRow = sheet.getLastRowNum();
	for(int i = 0;i<=lastRow;i++)
	{
		Row row = sheet.getRow(0);
		Row row2 = sheet.getRow(1);
		Cell cell = row.createCell(9);
		cell.setCellValue("status");

	}
	FileOutputStream fos = new FileOutputStream(path);
	workbook.write(fos);
	fos.close();
}
	}









//File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\data\\JMSA.xlsx");
//
//FileInputStream inputStream = new FileInputStream(file);
//   
//   //creating workbook instance that refers to .xls file
//   HSSFWorkbook wb=new HSSFWorkbook(inputStream);
//   
//   //creating a Sheet object
//   HSSFSheet sheet=wb.getSheet("Sheet1");
//
//
//
////	Row r = sheet.getRow(rowtoWrite);
//
////	Cell c = r.getCell(celltoWrite);
// HSSFCell cell = sheet.getRow(9).createCell(1);
////int cellType = c.getCellType();
//
////String value = valuetoBeWritten;
//cell.setCellValue("status");
//return ;
