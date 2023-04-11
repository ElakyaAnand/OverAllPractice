package seleniumwebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_upload_download {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/file.xhtml");
		
		
		WebElement download=ob.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		
		String filepath="C:\\Users\\anand\\Downloads";
		
		
		File files=new File(filepath);
		File[]  allfiles= files.listFiles();
		
		for (File file : allfiles) {
			
			if(file.getName().equals("TestLeaf Logo.png"))
			{
				System.out.println("The file is downloaded");
			}
			
		}
		
		
		WebElement uploadbutton=ob.findElement(By.id("j_idt88:j_idt89"));
		uploadbutton.click();
		
		Thread.sleep(3000);
		
		String path="C:\\Users\\anand\\Downloads\\TestLeaf Logo.png";
		
		StringSelection filepath1=new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
