package TestngFullpractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Grouptestng2 {
	@Test(groups="smoke")
	public void tc100() {
		System.out.println("tc100.."+"thread.id"+Thread.currentThread().getId());
	}@Test(groups="regression")
	public void tc2() {
		System.out.println("tc200.."+"thread.id"+Thread.currentThread().getId());
		
	}
	@Test(groups="sanity")
	public void tc3() {
		System.out.println("tc300.."+"thread.id"+Thread.currentThread().getId());
	}
}
