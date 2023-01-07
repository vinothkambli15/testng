package TestngFullpractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Grouptestng1 {
	@Test(groups="regression")
	public void tc10() {
		System.out.println("tc10.."+"thread.id"+Thread.currentThread().getId());
	}@Test(groups="samoke")
	public void tc20() {
		System.out.println("tc20.."+"thread.id"+Thread.currentThread().getId());
	
	}
	@Test(groups="sanity")
	public void tc3() {
		System.out.println("tc30.."+"thread.id"+Thread.currentThread().getId());

	}
}
