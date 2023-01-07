package org.t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstday {
	WebDriver driver;
 
	@Parameters({"mail","pass"})
	@Test
public void tc100(String mail,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	
	WebElement txtmail = driver.findElement(By.id("email"));
	txtmail.sendKeys(mail);
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys(pass);
}@Parameters({"mail1","pass1"})
@Test
	public void tc10(String mail,String pass) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	WebElement txtmail = driver.findElement(By.id("email"));
	txtmail.sendKeys(mail);
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys(pass);
}@Parameters({"mail12","pass12"})
@Test
public void tc1001(String mail,String pass) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");

WebElement txtmail = driver.findElement(By.id("email"));
txtmail.sendKeys(mail);
WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys(pass);
	}
}
