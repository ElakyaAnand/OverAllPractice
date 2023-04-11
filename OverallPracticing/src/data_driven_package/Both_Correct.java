package data_driven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Both_Correct {
	
	String[][] values={
			{"admin", "Admin123"},
			{"admin", "Admin1234"},
			{"admin1", "Admin123"},
			{"admin1", "Admin1234"}
	};
			
	
	
	@DataProvider(name="uservalues")
	public String[][] data_provider()
	{
		return values;
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
