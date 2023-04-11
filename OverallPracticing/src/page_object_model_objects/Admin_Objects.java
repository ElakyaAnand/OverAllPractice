package page_object_model_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Objects {
	
	
	
	@FindBy(linkText = "Admin")
	public static WebElement admin_link;
	
	
/*	{
		return ob.findElement(By.linkText("Admin"));
	}*/
	
	@FindBy(xpath="//label[text()='Username']//following::div//input[@class='oxd-input oxd-input--active']")
	public static WebElement username;
	
	
/*	{
		return ob.findElement(By.xpath("//label[text()='Username']//following::div//input[@class='oxd-input oxd-input--active']"));
	}*/
	
	
	@FindBy(xpath = "//label[text()='User Role']//following::i[1]")
	public static WebElement dropdown;
	
	
	/*
	 * { return
	 * ob.findElement(By.xpath("//label[text()='User Role']//following::i[1]")); }
	 */

	
	@FindBy(xpath = "//div[@role='listbox']//div[2]//span")
	public static WebElement admin_role;
	
	
	/*
	 * { return ob.findElement(By.xpath("//div[@role='listbox']//div[2]//span")); }
	 */
	
	
	
	@FindBy(xpath = "//label[text()='Status']//following::i[1]")
	public static WebElement Status;
	
	/*
	 * { return
	 * ob.findElement(By.xpath("//label[text()='Status']//following::i[1]"));
	 * 
	 * }
	 */
	
	
	@FindBy(xpath = "//div[@role='listbox']//following::div[3]//span[text()='Disabled']")
	public static WebElement Status_role;
	
	/*
	 * { return ob.findElement(By.xpath(
	 * "//div[@role='listbox']//following::div[3]//span[text()='Disabled']")); }
	 */
	
	
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement search_button;
	
	/*
	 * { return ob.findElement(By.xpath("//button[@type='submit']"));
	 * 
	 * }
	 */
}
