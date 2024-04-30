package group.Automation_Web01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class4InteractingWithWebElements extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
		System.out.println(text);
		
		String css = driver.findElement(By.xpath("//legend[contains(text(),'Switch Tab Example')]")).getCssValue("font-size");
		System.out.println(css);
		
		String css1 = driver.findElement(By.xpath("//legend[contains(text(),'Switch Tab Example')]")).getCssValue("background-color");
		System.out.println(css1);
		
		Boolean test = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		System.out.println(test);
		
		System.out.println("_______________");
		
		Boolean test2 = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
		System.out.println(test2);
		
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	
		Boolean test3 = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
		System.out.println(test3);
		
		System.out.println("___________________");
		
		driver.get("https://www.google.com/");
		Boolean test4 = driver.findElement(By.xpath("//div[@class='SDkEP']")).isEnabled();
		System.out.println(test4);
	
	
	}

}
