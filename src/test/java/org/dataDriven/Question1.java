package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws IOException {
//	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\FrameWork\\Driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		
		File f=new File("C:\\Users\\DELL\\Desktop\\Manju\\Selenium\\AllTask\\FrameWork\\ExcelSheet\\StudentDetail.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s=w.getSheet("Sheet1");
		
		int row=s.getPhysicalNumberOfRows();
		for(int i=0;i<row;i++)
		{
		System.out.println(row);
		Row r=s.getRow(i);
		
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
			Cell c=r.getCell(j);
		
			System.out.println(c);
		}
				
		}
	}
}
