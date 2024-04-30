package group.Automation_Web01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class6Wait extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://qavbox.github.io/demo/alerts/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='delayalert']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert = driver.switchTo().alert();
		
		Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
		
		driver.quit();
	}

}
