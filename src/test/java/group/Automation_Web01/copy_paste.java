package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class copy_paste extends BaseDriver{
	String url = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void cp() throws InterruptedException{
    driver.manage().window().maximize();
    driver.get(url);
    
    Actions action = new Actions(driver);
	WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
	firstname.sendKeys("Saima");
	Thread.sleep(2000);
	//Select all
	action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	//copy
	action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	//Tab
	firstname.sendKeys(Keys.TAB);
	action.build().perform();
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
	
	//paste
	action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(5000);
    
    
    
    /*Actions action = new Actions(driver);
		
	WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
	firstname.sendKeys("Saima");
	Thread.sleep(5000);
	//All select
	action.keyDown(Keys.CONTROL);
	action.sendKeys("A");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	//Copy
	action.keyDown(Keys.CONTROL);
	action.sendKeys("C");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	//Tab
	firstname.sendKeys(Keys.TAB);
	action.build().perform();
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
    
	//Paste
	action.keyDown(Keys.CONTROL);
	action.sendKeys("V");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	Thread.sleep(5000);*/
     }
}
