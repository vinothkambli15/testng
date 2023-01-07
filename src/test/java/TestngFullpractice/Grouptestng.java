package TestngFullpractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Grouptestng {
	@Test(groups="smoke")
	public void tc1() {
		System.out.println("tc1..."+"Thread.id"+Thread.currentThread().getId());
	}@Test(groups="sanity")
	public void tc2() {
		System.out.println("tc2..."+"thread.id"+Thread.currentThread().getId());
		
	}
	@Test(groups="regression")
	public void tc3() {
		System.out.println("tc3..."+"thread.id"+Thread.currentThread().getId());
	}
}
