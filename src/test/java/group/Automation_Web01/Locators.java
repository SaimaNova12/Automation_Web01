package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseDriver{
    
	@Test
	public void locators() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
	    WebElement id = driver.findElement(By.id("autocomplete"));
	    id.sendKeys("Bangladesh");
	   	Thread.sleep(2000);
	   	
	    WebElement radio1 = driver.findElement(By.name("radioButton"));
	    radio1.click();
	   	Thread.sleep(2000);
	   	
	   	WebElement cssselector = driver.findElement(By.cssSelector("input[value='radio2']"));
	   	cssselector.click();
	   	Thread.sleep(2000);
	   	
	   	WebElement xpath = driver.findElement(By.xpath("//input[@value='radio3']"));
	   	xpath.click();
	   	Thread.sleep(2000);
	   			
	    WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
	    option1.click();
	   	Thread.sleep(2000);
	   	
	   	WebElement tagname = driver.findElement(By.tagName("h1"));
	   	tagname.click();
	   	System.out.println(tagname.getText());
	   	
	  /* WebElement linktext = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
	   linktext.click();
	   Thread.sleep(2000);*/  
	   
	   WebElement partiallinktext = driver.findElement(By.partialLinkText("InterviewQues/ResumeAssistance/Material"));
	   partiallinktext.click();
	   Thread.sleep(2000); 
	   
	   
	}
}
