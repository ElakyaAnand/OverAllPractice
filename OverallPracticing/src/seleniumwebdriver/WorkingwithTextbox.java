package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class WorkingwithTextbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver ob=new ChromeDriver(co);
		ob.get("https://www.leafground.com/input.xhtml;jsessionid=node0n92mf9zm8wwbatc7bj44mv33164543.node0");
		
		ob.manage().window().maximize();
		
		WebElement nametextbox=ob.findElement(By.id("j_idt88:name"));
		nametextbox.sendKeys("Elakya");
		
		WebElement appendtext=ob.findElement(By.id("j_idt88:j_idt91"));
		appendtext.sendKeys(" Chennai");
		
		WebElement verificationtextbox=ob.findElement(By.id("j_idt88:j_idt93"));
		boolean verifystaus= verificationtextbox.isEnabled();
		System.out.println(verifystaus);
		
		
		WebElement clearme=ob.findElement(By.id("j_idt88:j_idt95"));
		clearme.clear();
		
		WebElement retrivetext=ob.findElement(By.id("j_idt88:j_idt97"));
		String textvalue= retrivetext.getAttribute("value");
		System.out.println("the retirve text is "+ textvalue);
		
		
		WebElement emailbox=ob.findElement(By.id("j_idt88:j_idt99"));
		emailbox.sendKeys("abc@xmail.com");
		emailbox.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		WebElement typeyourself=ob.findElement(By.id("j_idt88:j_idt101"));
		typeyourself.sendKeys("Keep Learning");
		
		Thread.sleep(3000);
		
		WebElement bold=ob.findElement(By.xpath("//div[@id='j_idt88:j_idt103']//div[@id='j_idt88:j_idt103_toolbar']//button[@class='ql-bold']"));
		bold.click();
		
		WebElement texteditor=ob.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']//div[1]//p"));
		texteditor.sendKeys("Keep Practicing");
		
		Thread.sleep(3000);
		
	
		
		
		
		
		
		
		
		WebElement justenter=ob.findElement(By.id("j_idt106:thisform:age"));
		justenter.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement labelposition=ob.findElement(By.id("j_idt106:float-input"));
		labelposition.click();
		
		Thread.sleep(3000);
		
		WebElement typenameandscroll=ob.findElement(By.id("j_idt106:auto-complete_input"));
		typenameandscroll.sendKeys("elakya");
		
		Thread.sleep(3000);
		
		WebElement scrollicon=ob.findElement(By.xpath("//select[@id='j_idt106:auto-complete_hinput']//preceding::button[@role='button']//span[1]"));
		scrollicon.click();
		
		Thread.sleep(3000);
		
		WebElement clickname=ob.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//ul//li[4]"));
		clickname.click();
		
		Thread.sleep(3000);
		
		
		WebElement dob=ob.findElement(By.id("j_idt106:j_idt116_input"));
		dob.sendKeys("07/05/1989");
		
		
		WebElement spinnumber=ob.findElement(By.id("j_idt106:j_idt118_input"));
		spinnumber.sendKeys("3");
		
		Thread.sleep(3000);
		
		WebElement spinarrow=ob.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']//following::a[1]"));
		spinarrow.click();
		
		WebElement randomnumber=ob.findElement(By.id("j_idt106:slider"));
		randomnumber.click();
		
		WebElement keyboard=ob.findElement(By.id("j_idt106:j_idt122"));
		keyboard.click();
		
		
		Thread.sleep(3000);
		
		WebElement toolbar=ob.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p"));
		toolbar.sendKeys("elakya");
		
		
		
		
				
				
				
		
		
	}

}
