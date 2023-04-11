package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/drag.xhtml");
		
		ob.manage().window().maximize();
		
		WebElement dragging=ob.findElement(By.id("form:conpnl_header"));
		WebElement dropping=ob.findElement(By.id("form:restrictPanel"));
		
		Actions action=new Actions(ob);
		action.clickAndHold(dragging).moveToElement(dropping).release(dropping).build().perform();
		
		Thread.sleep(3000);
		
		WebElement quantity=ob.findElement(By.xpath("//th[@id='form:j_idt94:j_idt99']//span"));
		
		WebElement category=ob.findElement(By.xpath("//th[@id='form:j_idt94:j_idt97']//span"));
		
		Actions actiontable=new Actions(ob);
		actiontable.clickAndHold(quantity).moveToElement(category).release(category).build().perform();
		
		
		Thread.sleep(3000);
		
		WebElement drophere=ob.findElement(By.id("form:drop_header"));
		WebElement dragtotarget=ob.findElement(By.id("form:drag_content"));
		
		Actions draganddrop=new Actions(ob);
		draganddrop.dragAndDrop(dragtotarget, drophere).build().perform();
		
		Thread.sleep(3000);
		
		WebElement bamboowatch=ob.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[1]"));
		WebElement bracelet=ob.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[5]"));
		
		Actions rows=new Actions(ob);
		rows.dragAndDrop(bracelet, bamboowatch).build().perform();
				
		Thread.sleep(3000);
		
		WebElement startbutton=ob.findElement(By.xpath("//button[@id='form:j_idt119']//span"));
		startbutton.click();
		
		
		Thread.sleep(7000);
		
		WebElement cancelbutton=ob.findElement(By.xpath("//button[@id='form:j_idt120']//span"));
		cancelbutton.click();
		
		
		WebElement rightslider=ob.findElement(By.xpath("//div[@id='form:j_idt125']//div//following::span[1]"));
	
		Actions slideaction=new Actions(ob);
		slideaction.clickAndHold(rightslider);
		slideaction.moveByOffset(40, 0).build().perform();
				
		
		
		
		

	}

}
