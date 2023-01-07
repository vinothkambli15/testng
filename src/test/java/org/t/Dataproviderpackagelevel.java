package org.t;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderpackagelevel {

	/*(dataProvider="TestData1",
			dataProviderClass=DataProviderdemo.class);
	@Test
	public void data(String email,String pas) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys(email);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pas);
	}*/
	@Test
	public static void main(String[] args) {
		 
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);

	}
	
}
