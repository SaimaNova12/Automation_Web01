package group.Automation_Web01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation_example {
	
	@BeforeSuite
	public void BeforSuiteTest(){
		System.out.println("This is Before Suite Test");
	}
	
	@Test(priority=1)
	public void firstTest(){
		System.out.println("This is First Test");
	}
	@Test(priority=0)
	public void secondtTest(){
		System.out.println("This is Second Test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is Before class Test");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("This is after class Test");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is Before Method Test");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is After Method Test");
	}
	@AfterSuite
	public void AfterSuiteTest(){
		System.out.println("This is After Suite Test");
	
	}
	
}
