package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBase {
	public static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\FrameWork\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
return driver;
	}
	public static void gUrl(String url) {
		driver.get(url);

	}
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);

	}
	public static void clk(WebElement ck) {
		ck.click();

	}
	public static String excelRead(int rowN,int cellN) throws IOException {
		File f=new File("C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\FrameWork\\ExcelSheet\\Facebook.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet("Sheet1");
		Row r = s.getRow(rowN);
		Cell c = r.getCell(cellN);
		String val=c.getStringCellValue();
		return val;
	}
	
	public static void excelWrite(int rowN,int cellN,String data) throws IOException
	{
		File f=new File("C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\FrameWork\\ExcelSheet\\Facebook.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet("Sheet1");
		Row r = s.getRow(rowN);
		Cell c = r.createCell(cellN);
		c.setCellValue(data);
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
		
	}
}
