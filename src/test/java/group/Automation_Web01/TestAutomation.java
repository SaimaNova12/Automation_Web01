package group.Automation_Web01;

import org.testng.annotations.Test;

public class TestAutomation extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
		Thread.sleep(3000);
	}

}
