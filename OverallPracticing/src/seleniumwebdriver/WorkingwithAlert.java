package seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingwithAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--reomte-allow-origins=*");
		WebDriver ob=new ChromeDriver(co);
		ob.get("https://www.leafground.com/alert.xhtml");
		
		
		WebElement simplealert=ob.findElement(By.id("j_idt88:j_idt91"));
		simplealert.click();
		Alert alert=ob.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		WebElement confirmbutton=ob.findElement(By.id("j_idt88:j_idt93"));
		confirmbutton.click();
		Alert alertconfirm=ob.switchTo().alert();
		
		Thread.sleep(3000);
		alertconfirm.accept();
		
		
		WebElement sweetbutton=ob.findElement(By.id("j_idt88:j_idt95"));
		sweetbutton.click();
		
		Thread.sleep(3000);
		
		WebElement dismissbutton=ob.findElement(By.id("j_idt88:j_idt98"));
		dismissbutton.click();
		
		Thread.sleep(3000);
		
		
		WebElement modaldialog=ob.findElement(By.id("j_idt88:j_idt100"));
		modaldialog.click();
		
		Thread.sleep(3000);
		
		WebElement modaldialogalert=ob.findElement(By.xpath("//span[@id='j_idt88:j_idt101_title']//following-sibling::a//span"));
		modaldialogalert.click();
		
		
		WebElement promotbutton=ob.findElement(By.id("j_idt88:j_idt104"));
		promotbutton.click();
		Alert promptalert=ob.switchTo().alert();
		Thread.sleep(3000);
		promptalert.sendKeys("Keep Learning");
		Thread.sleep(3000);
		promptalert.accept();
		
		
		WebElement sweetalert=ob.findElement(By.id("j_idt88:j_idt106"));
		sweetalert.click();
		Thread.sleep(3000);
		
		WebElement sweetdelete=ob.findElement(By.id("j_idt88:j_idt108"));
		sweetdelete.click();
		
		
		
		WebElement showbutton=ob.findElement(By.id("j_idt88:j_idt111"));
		showbutton.click();
		
		Thread.sleep(3000);
		
		WebElement maxibtton=ob.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[2]"));
		maxibtton.click();
		Thread.sleep(3000);
		
		
		WebElement closebutton=ob.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[1]"));
		closebutton.click();

	}

}
