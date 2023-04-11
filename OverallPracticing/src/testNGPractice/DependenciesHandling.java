package testNGPractice;

import org.testng.annotations.Test;

public class DependenciesHandling {
	
	
	@Test(enabled = true)
	public void tenthstd()
	{
		System.out.println("The tenth marks is vital to select the group in 12th std");
	}
	
	@Test(dependsOnMethods = "tenthstd")
	public void twenth()
	{
		System.out.println("The cut off is important for counseling");
	}
	
	@Test(dependsOnMethods = "twenth")
	public void engineering()
	{
	
		System.out.println("Complete without arrears");
	}

}
