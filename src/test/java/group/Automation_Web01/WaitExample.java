package group.Automation_Web01;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExample extends BaseDriver{
	String url ="https://www.selenium.dev/";
	
	@Test
    public void waitexm() throws InterruptedException {
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	//Implicit Waits(Not necessary)
    	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	
    	//explicit waits
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));//Driver pass kore dilam then time diye dilam
        //WebElement blog = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Blog')]")));
        WebElement blog = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Blog')]")));
        blog.click();
	    Thread.sleep(3000);
	    
	    /*WebElement text = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Getting Started')]")));
	    text.click();
	    Thread.sleep(3000);*/
	}
}
