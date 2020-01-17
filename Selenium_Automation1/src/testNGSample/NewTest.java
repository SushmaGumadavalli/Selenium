package testNGSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		// Actual functional Scripts will implements here
		System.out.println("@test f");
	}

	@Test
	public void a() {
		// Actual functional Scripts will implements here
		System.out.println("@test a");
	}

	/*
	 * @BeforeClass//Pre-condition of class public void bc() { //before run the
	 * actual scripts, this method will execute System.out.println("@BeforeClass");
	 * }
	 * 
	 * @AfterClass//post-condition public void af() { //after run the actual
	 * scripts, this method will execute System.out.println("@AfterClass"); }
	 */
	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}

}
