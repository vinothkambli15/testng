package org.t;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Testcase100 {
@Test
public void tc1() {
	assertTrue(false);
	System.out.println("tc1");
}
@Test
public void tc2() {
System.out.println("tc2");
}                                       
@Test
public void tc3() {
	System.out.println("tc3");
}
}
