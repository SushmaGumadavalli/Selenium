package testng;

import org.testng.annotations.Test;

public class SecondClass {
  @Test
  public void f() {
	  System.out.println("@test f");
  }
  @Test(enabled = false)
  public void a() {
	  System.out.println("@test a");
  }
  @Test
  public void m() {
	  System.out.println("@test m");
  }
}
