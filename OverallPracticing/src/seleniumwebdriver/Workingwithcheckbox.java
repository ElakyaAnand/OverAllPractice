package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Workingwithcheckbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/checkbox.xhtml");


		WebElement basicinput=ob.findElement(By.xpath("//div[@id='j_idt87:j_idt89']//div[2]"));
		basicinput.click();

		WebElement ajax=ob.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//div[2]"));
		ajax.click();


		WebElement langjava=ob.findElement(By.xpath("//table[@id='j_idt87:basic']//td[1]//div[2]"));
		langjava.click();

		WebElement langpython=ob.findElement(By.xpath("//table[@id='j_idt87:basic']//td[2]//div[2]"));
		langpython.click();

		WebElement tristate=ob.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[2]"));
		tristate.click();

		Thread.sleep(3000);

		tristate.click();
		Thread.sleep(3000);

		tristate.click();
		
		WebElement togglebutton=ob.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[2]"));
		togglebutton.click();
		
		WebElement verifybutton=ob.findElement(By.xpath("//div[@id='j_idt87:j_idt102']//div[2]"));
		boolean verifystatus= verifybutton.isEnabled();
		System.out.println("the button status is " + verifystatus);
		
		Thread.sleep(3000);
		WebElement multichose=ob.findElement(By.xpath("//div[@id='j_idt87:multiple']//div[3]//span"));
		multichose.click();
		Thread.sleep(3000);

		WebElement london=ob.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']//ul//li[2]//div//div[2]"));
		london.click();
		
		WebElement rome=ob.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']//ul//li[7]//div//div[2]"));
		rome.click();
	}

}
