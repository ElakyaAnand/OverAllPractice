package must_know_Concepts_java;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class File_config_Properties {

	public static void main(String[] args) throws IOException {
		
		WebDriver ob = null;
		
		FileInputStream filepath=new FileInputStream("config.properties");
		
		Properties properties=new Properties();
		properties.load(filepath);
		
		
	    String browser=	properties.getProperty("googlebrowser");
		String driverlocation= properties.getProperty("driverlocation");
	
		String firefoxbrowser= properties.getProperty("firefoxbrowser");
		String firefoxdriverlocation= properties.getProperty("firefoxlocation");
		
		
		if(browser.equalsIgnoreCase("CHrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			ob=new ChromeDriver();
		}
		else if(firefoxbrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", firefoxdriverlocation);
			ob=new FirefoxDriver();
		}
		
		
		ob.get("https://www.google.com");
	}

}
