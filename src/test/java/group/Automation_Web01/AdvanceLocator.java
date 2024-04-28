package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvanceLocator extends BaseDriver{
	
	
	@Test
	public void testpage() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		
	   	/*WebElement cssselector = driver.findElement(By.cssSelector("input[value='radio2']"));
	   	cssselector.click();
	   	Thread.sleep(2000);
	   	
	   	WebElement xpath = driver.findElement(By.xpath("//input[@value='radio3']"));
	   	xpath.click();
	   	Thread.sleep(2000);*/
	   	
	   	//cssSelector
	    driver.findElement(By.cssSelector("#checkBoxOption1")).click();
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(By.cssSelector(".radioButton")).click();
	   	Thread.sleep(2000);
	   	
	   	//css
	   	String gtest = driver.findElement(By.cssSelector("h1")).getText();
	   	System.out.println("Get by CSS "+gtest);
	   	Thread.sleep(2000);
	   	
	   	//xpath
	   	String test2 = driver.findElement(By.xpath("//h1")).getText();
	   	System.out.println("Get by Xpath "+test2);
	   	Thread.sleep(2000);
	   	
	   	//*[@value = 'radio3']
	   	driver.findElement(By.xpath("//*[@value = 'radio3']")).click();
	   	Thread.sleep(1000);
	   	
	   	String text = driver.findElement(By.cssSelector("div[id = 'checkbox-example'] > fieldset > legend")).getText();
	   	System.out.println(text);
	   	
	   	String text1 = driver.findElement(By.xpath("//div[@id = 'checkbox-example'] / fieldset / legend")).getText();
	   	System.out.println(text1);
	   	
	   	driver.findElement(By.cssSelector("input[name='radioButton'][value='radio1']")).click();
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("//input[@name='radioButton' and @value='radio2']")).click();
	   	Thread.sleep(1000);
	   	
	   	//For dynamic value 
        driver.findElement(By.cssSelector("input[placeholder^=\"Enter Your\"]")).sendKeys("Saima");
	   	Thread.sleep(1000);
	   	
	   	driver.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys("Saima");
	   	Thread.sleep(1000);
	   	
	   	driver.findElement(By.xpath("//input[contains(@placeholder,\"Your Name\")]")).sendKeys("Saima");
	   	Thread.sleep(1000);
	}


}
