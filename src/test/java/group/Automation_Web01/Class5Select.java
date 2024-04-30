package group.Automation_Web01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class5Select extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(2000);
		select.selectByVisibleText("Option2");
		Thread.sleep(2000);
		select.selectByValue("option1");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        
        System.out.println(select.getFirstSelectedOption().getText());
        
        List<WebElement> options = select.getOptions();
        for(WebElement e : options) {
        	System.out.println(e.getText());
        }
        
        
	}

}
