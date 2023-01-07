package TestngFullpractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestngPassingparameterTest {

  @Test
  public void tc1() {
	  System.out.println("tc1");
  }@Test
  public void tc2() {
	  System.out.println("tc2");
	  System.out.println("tc3");
	  //Assertion soft assert
	  SoftAssert a= new SoftAssert();
	  a.assertTrue(true);
	  System.out.println("tc4");
	  System.out.println("tc5");
	  a.assertAll();
	  System.out.println("tc6");
  }
  

  @Test
  public void tc3() {
	  SoftAssert a= new SoftAssert();

	  a.assertAll();
	  System.out.println("tc10");

	  System.out.println("tc11");
  }
}
