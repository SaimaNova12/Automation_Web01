package group.Automation_Web01;

import org.testng.annotations.Test;

public class Class6Assertions extends BaseDriver{
    
	@Test
	public void test() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
	}
}
