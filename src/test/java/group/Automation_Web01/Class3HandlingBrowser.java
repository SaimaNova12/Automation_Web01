package group.Automation_Web01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class3HandlingBrowser {
	
	   @Test
       public void browser() throws InterruptedException {
    	   WebDriver driver = new ChromeDriver();
    	   driver.manage().window().maximize();
    	   Thread.sleep(2000);
    	   /*driver.manage().window().minimize();
    	   Thread.sleep(2000);
    	   driver.manage().window().fullscreen();
    	   Thread.sleep(2000);
    	   driver.manage().window().maximize();
    	   Thread.sleep(2000);*/
    	   driver.get("https://www.google.com/");
    	   Thread.sleep(2000);
    	   driver.navigate().to("https://www.facebook.com/");
    	   Thread.sleep(2000);
    	  /* driver.navigate().back();
    	   Thread.sleep(2000);
    	   driver.navigate().forward();
    	   Thread.sleep(2000);
    	   driver.navigate().refresh();
    	   Thread.sleep(2000);*/
    	   
    	   driver.switchTo().newWindow(WindowType.TAB);
    	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	   Thread.sleep(2000);
    	   
    	   driver.switchTo().newWindow(WindowType.WINDOW);
    	   driver.get("https://www.facebook.com/");
    	   Thread.sleep(1000);
    	   driver.close();
    	   Thread.sleep(1000);
    	   driver.quit();
    	   
       }

	
}
