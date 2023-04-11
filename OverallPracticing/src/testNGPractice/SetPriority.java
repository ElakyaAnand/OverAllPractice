package testNGPractice;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority = 3)
	public void Automation_Online_Testing()
	{
		System.out.println("Have to complete the manual testing");
	}
	
	@Test(priority = 1)
	public void LearnAutomationOnline()
	{
		System.out.println("Practice what we studied daily");
	}
	
	@Test(priority = 2)
	public void englishpractice()
	{
		System.out.println("Improve the communication");
		
	}

}
