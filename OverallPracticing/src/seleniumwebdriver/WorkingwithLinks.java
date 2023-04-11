package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingwithLinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/link.xhtml;jsessionid=node0n92mf9zm8wwbatc7bj44mv33164543.node0");
		
		
		WebElement dashboard=ob.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		ob.navigate().back();
		
		WebElement withoutclicking=ob.findElement(By.linkText("Find the URL without clicking me."));
		String hrefvalue= withoutclicking.getAttribute("href");
		System.out.println("The link is redirecting to "+ hrefvalue);
		
		
		WebElement broken=ob.findElement(By.partialLinkText("Broken"));
		broken.click();
		
		WebElement titletext= ob.findElement(By.xpath("//h2"));
		String titltevalue= titletext.getText();
		
		
		if(titltevalue.contains("404"))
		{
			System.out.println("The title is broken");
		}else {
			System.out.println("the title is not broken");
		}
		
		ob.navigate().back();
		
		
		WebElement dashboardduplicate=ob.findElement(By.linkText("Go to Dashboard"));
		dashboardduplicate.click();
		ob.navigate().back();
		
		
		List<WebElement> totalpagelinks=ob.findElements(By.tagName("a"));
		int hrefcount= totalpagelinks.size();
		System.out.println("The total links available in this page "+ hrefcount);
		
		
		List<WebElement> pagelinks=ob.findElements(By.xpath("//div[@class='grid ui-fluid']//following::a"));
		int countlinks= pagelinks.size();
		System.out.println("the totla links in the page " + countlinks);

	}

}
