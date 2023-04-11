package seleniumwebdriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitWebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_with_WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob = new ChromeDriver();
		ob.get("https://www.leafground.com/window.xhtml;jsessionid=node0yccz2czym4th13vmx0h3q9u9g187223.node");

		String parentwindow = ob.getWindowHandle();

		WebElement newwindow = ob.findElement(By.id("j_idt88:new"));
		newwindow.click();

		Thread.sleep(3000);
		Set<String> openedwindows = ob.getWindowHandles();

		for (String oldwindow : openedwindows) {
			ob.switchTo().window(oldwindow);

		}
		ob.close();
		ob.switchTo().window(parentwindow);

		WebElement openmultiople = ob.findElement(By.id("j_idt88:j_idt91"));
		openmultiople.click();

		Set<String> openedcount = ob.getWindowHandles();
		int windowscount = openedcount.size();

		System.out.println("the number of opened windows are " + windowscount);

		WebElement closewindows = ob.findElement(By.id("j_idt88:j_idt93"));
		closewindows.click();

		Set<String> windowsopened = ob.getWindowHandles();

		for (String string : windowsopened) {

			if (!string.equals(parentwindow)) {
				ob.switchTo().window(string);
				
			}

			ob.close();
		

		}

	}

}
