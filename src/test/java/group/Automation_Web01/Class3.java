package group.Automation_Web01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class3 extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	
	//Siblings concept
	driver.findElement(By.xpath("//th[text()='Course']/preceding-sibling::th")).getText();
	System.out.println();
	driver.findElement(By.xpath("//th[text()='Course']/following-sibling::th")).getText();
    
     }
}
