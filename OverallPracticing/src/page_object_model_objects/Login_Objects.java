package page_object_model_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Login_Objects {

	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public static WebElement usernmae;
	
	
	@FindBy(xpath="//input[@type='password']")
	public  static WebElement password;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginbutton;
	
	/*
	 * { return ob.findElement(By.xpath("//input[@name='username']")); }
	 */
	
	
	
	/*
	 * { return ob.findElement(By.xpath("//input[@type='password']"));
	 * 
	 * }
	 */
	
	
	
	/*
	 * { return ob.findElement(By.xpath("//button[@type='submit']"));
	 * 
	 * }
	 */
	
	
}
