package testNGPractice;

import org.testng.annotations.Test;

public class GroupingExamples {
	
	@Test(groups = "Phone")
	public void Apple_phone()
	{
		System.out.println("Apple phone is highly secured");
	}
	
	@Test(groups = "Phone")
	public void Anroid_Phone()
	{
	
		System.out.println("Anroid phones are user friendly");
	}
	
	
	@Test(groups = "Laptop")
	public void Dell_Laptop()
	{
		System.out.println("Dell laptop is well configured one");
	}
	
	
	@Test(groups = "Laptop")
	public void Apple_Laptop()
	{
		System.out.println("Apple laptops are cost high");
	}

}
