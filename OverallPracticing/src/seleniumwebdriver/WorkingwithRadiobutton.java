package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingwithRadiobutton {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/radio.xhtml");
		
		
		WebElement chromebrowser=ob.findElement(By.xpath("//table[@id='j_idt87:console1']//td[1]//div[2]"));
		chromebrowser.click();
		
		WebElement chennaibutton=ob.findElement(By.xpath("//div[@id='j_idt87:city2']//div//div[2]//span[1]//following::label[text()='Chennai']"));
		chennaibutton.click();
		
		WebElement chrome=ob.findElement(By.xpath("//table[@id='j_idt87:console2']//td[1]//div//div[2]//span"));
		WebElement firefox=ob.findElement(By.xpath("//table[@id='j_idt87:console2']//td[2]//div//div[2]//span"));
		WebElement safari=ob.findElement(By.xpath("//table[@id='j_idt87:console2']//td[3]//div//div[2]//span"));
		WebElement edge=ob.findElement(By.xpath("//table[@id='j_idt87:console2']//td[4]//div//div[2]//span"));
		
		if(chrome.isSelected())
		{
			System.out.println("the default selection is "+ chrome);
		}
		
		
		  else if (firefox.isSelected()){
		  
		  System.out.println("the default selection is "+ firefox);
		  
		  }
		  
		  else if (safari.isSelected()){
		  
		  System.out.println("the default selection is "+ safari);
		  
		  } else if (edge.isSelected()){
		  
		  System.out.println("the default selection is "+ edge);
		  
		  }
		 

		
		
		
		
	}

}
