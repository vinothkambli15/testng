package org.t;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listdemo {
	static WebDriver driver;
	@Test
	public void launchbrower() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination");
		
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a"));
		int size = list.size();
		System.out.println(size);
		if(size>0) {
			do {
		WebElement nextclick = driver.findElement(By.id("dtBasicExample_next"));
		String attribute = nextclick.getAttribute("class");
		System.out.println(attribute);
		nextclick.click();
		if(!attribute.contains("disabled")) {
			nextclick.click();
		}else {
			break;
		}
		}
			while(true);
	}else {
		System.out.println("no pagination");
	}
	
}
}

