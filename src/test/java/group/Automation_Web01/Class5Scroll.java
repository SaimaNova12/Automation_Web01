package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class5Scroll extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(2000);
        
        WebElement test = driver.findElement(By.xpath("//legend[contains(text(),'iFrame Example')]"));
        js.executeScript("arguments[0].scrollIntoView();",test);
        test.click();
        Thread.sleep(2000);
	
	}

}
