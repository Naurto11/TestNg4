package org.run;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner extends BaseClass {

	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() throws InterruptedException {

		Thread.sleep(7000);
//		closebrowser();

	}

	@BeforeMethod

	public void startsTime() throws InterruptedException {

		passUrl("http://192.168.1.111:8085/JMSRS/jmslogin.php");

	}

	@AfterMethod

	public void endsTime() throws InterruptedException {

		Thread.sleep(7000);

	}

//	@Test
//	private void tc1() throws InterruptedException, IOException {
//
//		LoginPojo l = new LoginPojo();
//
//		toInput(l.getUserid(), excelRead(1, 3));
//		toInput(l.getPassword(), excelRead(1, 4));
//		btnClick(l.getPressBtn());
//		
//		
//		
//	//	[{"id":"TC001","userid":"----","password":"----"}];
//		
//		System.out.println(excelRead(1, 3));
//		System.out.println(excelRead(1, 4));
//		
//		
//	}
//
//	@Test
//	private void tc2() throws IOException {
//
//		LoginPojo l1 = new LoginPojo();
//		toInput(l1.getUserid(), excelRead(2, 3));
//		toInput(l1.getPassword(), excelRead(2, 4));
//		btnClick(l1.getPressBtn());
//		
//		System.out.println(
//				excelRead(2, 3));
//		System.out.println(excelRead(2, 4));
//
//	}
//
//	@Test
//	private void tc3() throws IOException {
//
//		LoginPojo l2 = new LoginPojo();
//		toInput(l2.getUserid(), excelRead(3, 3));
//		toInput(l2.getPassword(), excelRead(3, 4));
//		btnClick(l2.getPressBtn());
//		
//		System.out.println(excelRead(3, 3));
//
//		System.out.println(excelRead(3, 4));
//}
//
//	@Test
//	private void tc4() throws IOException {
//		
//		LoginPojo l3 = new LoginPojo();
//		toInput(l3.getUserid(), excelRead(4, 3));
//		toInput(l3.getPassword(), excelRead(4, 4));
//		btnClick(l3.getPressBtn());
//		
//
//		System.out.println(excelRead(4,3 ));
//		System.out.println(excelRead(4, 4));
//	}
//
//	@Test
//	private void tc5() throws IOException {
//		
//		LoginPojo l4 = new LoginPojo();
//		toInput(l4.getUserid(), excelRead(5, 3));
//		toInput(l4.getPassword(), excelRead(5, 4));
//		btnClick(l4.getPressBtn());
//		
//		
//	}
//	@Test
//	
//	private void tc6() throws IOException {
//		LoginPojo l5 = new LoginPojo();
//		toInput(l5.getUserid(), excelRead(6, 3));
//		toInput(l5.getPassword(), excelRead(6, 4));
//		btnClick(l5.getPressBtn());
//		
//		System.out.println(excelRead(6, 3));
//		System.out.println(excelRead(6, 4));
//
//
//	}
	
	
	@Test
	private void write() throws IOException, InterruptedException {

		LoginPojo login = new LoginPojo();
		System.out.println("Suresh before" + excelRead(1, 4));
		for (int i = 1; i < 7; i++) {
			// System.out.println(i);
			System.out.println(excelRead(i, 3));
			System.out.println(excelRead(i, 4));
			//

			toInput(login.getUserid(), excelRead(i, 3));
			toInput(login.getPassword(), excelRead(i, 4));
			Thread.sleep(1000);
			btnClick(login.getPressBtn());}
//
//			if (driver.findElement(By.xpath("//div[text()='Please enter Username & password']")).isDisplayed()) {
//
//				System.out.println("username and passwordn is empty");
//
//				driver.findElement(By.xpath("//button[text()='OK']")).click();
//
//				return "invalid";
//
//			}
//
//			else if (driver.findElement(By.xpath("//*[text()= 'Invalid User']")).isDisplayed()) {
//				System.out.println("invalid user");
//				driver.findElement(By.xpath("//button[text()='OK']")).click();
//
//				return "invalid";
//			}
//
//		}
//		return "valid";
	}

	@Test(enabled = false)
	private void writeFile() throws IOException {

		String Output = "";
		String results = "";
		for (int j = 1; j < 7; j++) {
			LoginPojo l = new LoginPojo();

			// System.out.println(j);
			toInput(l.getUserid(), excelRead(j, 3));
			toInput(l.getPassword(), excelRead(j, 4));

			btnClick(l.getPressBtn());

			FileWriter writer = new FileWriter(
					"C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\notepad\\selenium_output.txt");
			writer.write(Output += excelRead(j, 0) + "||" + excelRead(j, 2) + "||" + excelRead(j, 6) + "\n");

			try {
				// FileWriter writer = new
				// FileWriter("C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\notepad\\selenium_output.txt");
				// writer.write(Output+=excelRead(j, 2));

				// writer.write("welcome to jms");
				// writer.write("\r\n"); // write new line

				if (j != 6) {

					driver.navigate().refresh();

				}

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}