package page_object_model_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page_object_model_objects.Admin_Objects;
import page_object_model_objects.Login_Objects;

public class Admin_TestCase {
	
	
	@Test
	public void admin_page() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
	WebDriver ob=new ChromeDriver();
	ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	

	
	
	Thread.sleep(3000);
	ob.manage().window().maximize();
	PageFactory.initElements(ob, Login_Objects.class);
	
	Login_Objects.usernmae.sendKeys("Admin");
	Login_Objects.password.sendKeys("admin123");
	Login_Objects.loginbutton.click();
	
	Thread.sleep(3000);
	
	PageFactory.initElements(ob, Admin_Objects.class);
	
	Admin_Objects.admin_link.click();
	Thread.sleep(3000);
	
	Admin_Objects.username.sendKeys("Paul");
	Admin_Objects.dropdown.click();
	
	Thread.sleep(3000);
	
	Admin_Objects.admin_role.click();
	
	Admin_Objects.Status.click();
	
	Thread.sleep(3000);
	
	Admin_Objects.Status_role.click();
	
	Thread.sleep(3000);
	
	Admin_Objects.search_button.click();
	}
}
