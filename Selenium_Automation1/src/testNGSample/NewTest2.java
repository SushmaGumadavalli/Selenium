package testNGSample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	@Test//3
	public void f() {
		System.out.println("Test f");
	}

	@Test//3
	public void k() {
		System.out.println("Test k");
	}

	@BeforeMethod//2
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@AfterMethod//4
	public void afterMethod() {
		System.out.println("After method");
	}

	@BeforeClass//1
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass//5
	public void afterClass() {
		System.out.println("After class");
	}

}
