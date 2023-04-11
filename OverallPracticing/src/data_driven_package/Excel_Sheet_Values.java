package data_driven_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Sheet_Values {
	
	
	
	
	String[][] values= {};
	
	
	@DataProvider(name="uservalues")
	public String[][] data_provider() throws BiffException, IOException
	{
		values=excel_sheet_data();
		return values;
	}
	
	
	public String[][] excel_sheet_data() throws BiffException, IOException
	{
		
	
		File path=new File("D:\\Excel creating\\Excel.xls");
		Workbook  workbook= Workbook.getWorkbook(path);
		Sheet sheet= workbook.getSheet(0);
		int rowcount= sheet.getRows();
		int columncount= sheet.getColumns();
		
		
		String[][] tablevalues=new String[rowcount-1][columncount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
			tablevalues[i-1][j]=	sheet.getCell(j, i).getContents();
			}
		}
		return tablevalues;
	}
	
	
	
	@Test(dataProvider = "uservalues")
	public void both_correct_values(String Uname, String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		WebElement username=ob.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(Uname);
		
		
		WebElement password=ob.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pwd);
		
		WebElement loginbutton=ob.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
	}

}
