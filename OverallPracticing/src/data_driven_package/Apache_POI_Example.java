package data_driven_package;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Apache_POI_Example {
	
static	List<String> username=new ArrayList<String>();
static	List<String> password=new ArrayList<String>();



	
	

	
	
	public  void excel_sheet_poi() throws InvalidFormatException, IOException
	{
		
		File filepath=new File("D:\\Excel creating\\POI.xlsx");
		Workbook workbook=new XSSFWorkbook(filepath);
		Sheet sheet= workbook.getSheetAt(0);
		
		Iterator<Row> rowiterator=sheet.iterator();
		while(rowiterator.hasNext())
		{
			Row rows=rowiterator.next();
			
			Iterator<Cell> celliterator= rows.iterator();
			
			int i=2;
			
			while(celliterator.hasNext())
			{
				if(i%2==0)
				{
					username.add(celliterator.next().getStringCellValue());
				}
				else
				{
					password.add(celliterator.next().getStringCellValue());
				}
				i++;
				}
			}workbook.close();
		
	}
	
	
	public void execute_login() throws InterruptedException
	{
		for(int i=0;i<username.size();i++)
		{
			both_correct_values(username.get(i), password.get(i));	
		}
	}
	
	
	@Test(dataProvider = "uservalues")
	public  void both_correct_values(String Uname, String pwd) throws InterruptedException
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
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		Apache_POI_Example poi_example=new Apache_POI_Example();
		
		poi_example.excel_sheet_poi();
		System.out.println("The row values are :" + username);
		System.out.println("the column values are: "+ password);
		
		poi_example.execute_login();
		
		
	}

}
