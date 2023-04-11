package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	
	@Test
	@Parameters({"UN", "PWD"})
	public void orangeHRM(String uname, String pword) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement username=ob.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(uname);
		
		
		WebElement password=ob.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pword);
		
		
		WebElement loginbutton=ob.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
	}

}
