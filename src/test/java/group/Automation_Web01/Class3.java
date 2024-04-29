package group.Automation_Web01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class3 extends BaseDriver{
	
	@Test
	public void test() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	
	//Siblings concept
	String m = driver.findElement(By.xpath("//th[text()='Course']/preceding-sibling::th")).getText();
	System.out.println(m);
	String m1 = driver.findElement(By.xpath("//th[text()='Course']/following-sibling::th")).getText();
    System.out.println(m1);
    String m2 = driver.findElement(By.xpath("//table[@name='courses']//tr")).getText();
    System.out.println(m2);
    List<WebElement> tabledata = driver.findElements(By.xpath("//table[@name='courses']//td"));
    System.out.println(tabledata.size());
    for(WebElement e : tabledata) {
    	System.out.println(e.getText());
    }
   
     }
}
