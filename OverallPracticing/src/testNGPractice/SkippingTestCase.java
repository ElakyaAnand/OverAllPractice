package testNGPractice;

import org.testng.annotations.Test;

public class SkippingTestCase {
	
	
	@Test
	public void food()
	{
		System.out.println("Eat Food correctly");
	}
	
	@Test(enabled = false)
	public void games()
	{
		System.out.println("Games is enjoyable");
	}
	
	@Test
	public void studies()
	{
		System.out.println("Study, slowly wins the race");
	}

}
