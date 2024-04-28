package group.Automation_Web01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class6_Iframe extends BaseDriver{

	
	@Test
	public void test() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/products/-i360901201-s1782529511.html?spm=a2a0e.searchlistcategory.sku.3.657c5c88PejmTo&search=1");
		Thread.sleep(3000);
		
		WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
		cart.click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.className("login-iframe"))); 
		WebElement sendnum = driver.findElement(By.xpath("//input[@placeholder = 'Please enter your Phone Number or Email']"));
		sendnum.sendKeys("01644417057");
		Thread.sleep(1000);
		
		WebElement sendpass = driver.findElement(By.xpath("//input[@placeholder='Please enter your password']"));
		sendpass.sendKeys("saima34");
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login.click();
		Thread.sleep(3000);
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		WebElement gocart = driver.findElement(By.xpath("//button[contains(text(),'GO TO CART')]"));
		gocart.click();
		Thread.sleep(2000);
		
		WebElement pay = driver.findElement(By.cssSelector(".next-btn.next-btn-primary.next-btn-large.checkout-order-total-button.automation-checkout-order-total-button-button"));
		pay.click();
		Thread.sleep(6000);
		//driver.switchTo().parentFrame();
	
	
	
	}
}
