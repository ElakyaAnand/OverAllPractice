package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class WorkingwithButtons {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--reomte-allow-origing=*");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/button.xhtml");
		
		ob.manage().window().maximize();
		
		
		WebElement titlebutton=ob.findElement(By.id("j_idt88:j_idt90"));
		titlebutton.click();
		String titlevalue= ob.getTitle();
		System.out.println("The Title is "+ titlevalue);
		ob.navigate().back();
		
		
		WebElement verifybutton=ob.findElement(By.id("j_idt88:j_idt92"));
		boolean verifystatus= verifybutton.isEnabled();
		System.out.println("the status is"+ verifystatus);
		
		
		WebElement positionbutton=ob.findElement(By.id("j_idt88:j_idt94"));
		Point positionvalues= positionbutton.getLocation();
		int xposition= positionvalues.getX();
		int yposition=positionvalues.getY();
		System.out.println("The x value is "+ xposition + " The y value is "+ yposition);
		
		
		WebElement savebuttoncolor=ob.findElement(By.id("j_idt88:j_idt96"));
		String colorvalue= savebuttoncolor.getCssValue("background");
		System.out.println("The color button is "+ colorvalue);
		
		
		WebElement heightbutton=ob.findElement(By.id("j_idt88:j_idt98"));
		Dimension sizevalues= heightbutton.getSize();
		int heightvalue= sizevalues.getHeight();
		int widthvalue= sizevalues.getWidth();
		System.out.println("The height value is "+ heightvalue + " The width value is "+ widthvalue);
		
		Thread.sleep(3000);
		
		WebElement mousehover=ob.findElement(By.id("j_idt88:j_idt100"));
		Actions action=new Actions(ob);
		action.moveToElement(mousehover).build().perform();
		
		Thread.sleep(3000);
		
		
		WebElement imagebutton=ob.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imagebutton.click();
		Thread.sleep(3000);
		imagebutton.click();
		
		List<WebElement> roundbuttons=ob.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']//following::button"));
		int buttoncount= roundbuttons.size();
		System.out.println("The button count is "+ buttoncount);

	}

}
