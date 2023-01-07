 package Airindia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
@Test 
public void login() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	
LinkedList<String>names= new LinkedList<String>();
	names.add("vinoth");
	names.add("kambli");
	names.add(0,"jiu");
	System.out.println(names);
}
}
