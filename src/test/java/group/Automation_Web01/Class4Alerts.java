package group.Automation_Web01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class4Alerts extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
    Thread.sleep(1000);
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
    Thread.sleep(2000);
    alert = driver.switchTo().alert();
    alert.dismiss();
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
    
    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
    Thread.sleep(2000);
    alert = driver.switchTo().alert();
    alert.sendKeys("confirm");
    Thread.sleep(2000);
    alert.accept();
    System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
    
    
    
    
    driver.quit();
     }
}
