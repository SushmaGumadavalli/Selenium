package testng;

import org.testng.annotations.Test;

public class Samplesecondclass {
  @Test
  public void f() {
	  System.out.println("@test f");
  }
  @Test(enabled = false)
  public void h() {
	  System.out.println("@test h");
  }
  @Test
  public void l() {
	  System.out.println("@test l");
  }
}
