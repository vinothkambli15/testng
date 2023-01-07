package org.t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderdemo {
	@Test
	public void tc1(String email,String pas) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys(email);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pas);
	}
//	@DataProvider(name="TestData1")
//	public Object[][]data(){
//		return new Object[][] {
//			{"abc@gmail.com","user1"},
//			{"abc@gmail.com","user165640"},
//			{"abc@gmail.com","user12364"},
//			{"abc@gmail.com","user123"},
//			{"abc@gmail.com","user2"},
//		};
//	}
}



