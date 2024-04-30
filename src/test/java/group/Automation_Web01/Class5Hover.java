package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class5Hover extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		action.scrollToElement(hover).build().perform();
		Thread.sleep(2000);	
		action.scrollByAmount(0, 100).build().perform();
		Thread.sleep(2000);	
		action.clickAndHold(hover).build().perform();
		Thread.sleep(5000);
		/*WebElement m11 = driver.findElement(By.xpath("//button[@id='mousehover']"));
        Thread.sleep(2000);*/
        
		driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click();
        Thread.sleep(5000);
	
	}

}
