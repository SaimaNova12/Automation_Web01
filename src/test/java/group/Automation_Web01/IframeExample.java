package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeExample extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		driver.switchTo().frame("courses-iframe"); //getElement(By.id("courses-iframe"));
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		String m  = driver.findElement(By.xpath("//legend[contains(text(),'iFrame Example')]")).getText();
		System.out.println("Frame Title "+m);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frame "+iframeNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.switchTo().frame("courses-iframe");
		WebElement iframe = driver.findElement(By.xpath("//a[text()='Register']"));
		iframe.click();
		Thread.sleep(4000);*/
		
		
		
		
		/*driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath(""));
		//driver.findElement(By.id("courses-iframe"));*/
	}

}
