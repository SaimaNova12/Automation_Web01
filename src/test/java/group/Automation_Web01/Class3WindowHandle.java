package group.Automation_Web01;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class3WindowHandle extends BaseDriver{
	
	@Test
	public void window() throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(2000);
		
		List<String> windowhandle = new ArrayList<>(driver.getWindowHandles());
        for(String handle : windowhandle) {
        	System.out.println(handle);
        }
	    driver.switchTo().window(windowhandle.get(1));
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	
        driver.quit();
	}

}
