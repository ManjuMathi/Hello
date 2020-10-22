package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
public class Facebook extends FacePojo{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver d=launchBrowser();
		d.get("https://www.facebook.com/");
	
		FacePojo f=new FacePojo();
		fill(f.getUser(),excelRead(0, 0));
		fill(f.getPas(), excelRead(0, 1));
		clk(f.getLog());
		Thread.sleep(3000);
		
		String s=f.getWrong().getText();
		excelWrite(1, 0, s);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
