package seleniumwebdriver;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_IFrames {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/frame.xhtml");
		
		
		ob.switchTo().frame(0);
		WebElement clickme=ob.findElement(By.id("Click"));
		clickme.click();
		String textresult= clickme.getText();
		System.out.println("The frame text is "+ textresult);
		
		ob.switchTo().defaultContent();
		
		
		List<WebElement> countframes=ob.findElements(By.tagName("iframe"));
		int count= countframes.size();
		System.out.println("the frame count " + count);
		
		
		
	
		

	}

}
