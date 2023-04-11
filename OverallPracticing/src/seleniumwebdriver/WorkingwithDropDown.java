package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/select.xhtml");
		
		ob.manage().window().maximize();
		
		WebElement UItool=ob.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']//following::select[1]"));
		Select sel=new Select(UItool);
		sel.selectByIndex(1);
		
		Thread.sleep(3000);
		
		WebElement countrylist=ob.findElement(By.xpath("//h5[text()='Choose your preferred country.']//following::label[text()='Select Country']"));
		countrylist.click();
		
		
		Thread.sleep(3000);
		
		

		WebElement country=ob.findElement(By.xpath("//div[@id='j_idt87:country_panel']//ul[@id='j_idt87:country_items']//li[4]"));
		country.click();
		
		Thread.sleep(3000);
		
		WebElement cities=ob.findElement(By.xpath("//label[@id='j_idt87:city_label']//following::span[1]"));
		cities.click();
		
		WebElement citylist=ob.findElement(By.xpath("//ul[@id='j_idt87:city_items']//li[3]"));
		citylist.click();
		
		Thread.sleep(3000);
		
		WebElement course=ob.findElement(By.xpath("//div[@id='j_idt87:auto-complete']//button//span[1]"));
		course.click();
		
		Thread.sleep(3000);
		
		WebElement courselist=ob.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//ul//li[3]"));
		courselist.click();
		
		Thread.sleep(3000);
		
		WebElement lang=ob.findElement(By.xpath("//div//label[@id='j_idt87:lang_label']"));
		lang.click();
		
		Thread.sleep(3000);
		WebElement langlist=ob.findElement(By.xpath("//div[@id='j_idt87:lang_panel']//ul//li[3]"));
		langlist.click();
		
		
		Thread.sleep(3000);
		WebElement langselction=ob.findElement(By.xpath("//label[@id='j_idt87:value_label']"));
		langselction.click();

		Thread.sleep(3000);
		
		WebElement langschoose=ob.findElement(By.xpath("//ul[@id='j_idt87:value_items']//li[2]"));
		langschoose.click();
	}

}
