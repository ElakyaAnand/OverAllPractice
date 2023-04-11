package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite_in_TestNG {

	WebDriver ob;
	long starttime;
	long endtime;
	long totaltime;
	
	@BeforeSuite
	public void browserlaunching()
	{
		starttime= System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		ob=new ChromeDriver();
		
	}
	
	@Test
	public void google()
	{
		ob.get("https://www.google.com");
	}
	
	@Test
	public void yahoo()
	{
		ob.get("https://www.yahoo.com");
	}
	
	
	@AfterSuite
	public void closebrowser()
	{
		ob.close();
		endtime=System.currentTimeMillis();
		totaltime=endtime-starttime;
		System.out.println("The total time taken is "+ totaltime);
	}
	
}
