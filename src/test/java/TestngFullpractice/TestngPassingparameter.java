package TestngFullpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngPassingparameter  {
	
	WebDriver driver;
	
	@Parameters("Browsers")
	@Test
	public void beforemethod(String browser) throws IOException {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	WebElement txtmail = driver.findElement(By.id("email"));
	txtmail.sendKeys("kambli");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("vinoth");
	TakesScreenshot tk =(TakesScreenshot)driver;
	File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
	File dec= new File("C:\\Users\\vinoth\\Downloads\\New folder\\kambli.png");
	FileUtils.copyFile(screenshotAs, dec);
}
		
	}
//	@Parameters({"mail1","pass1"})
//    @Test
//public void tc2(@Optional("arn@gmai")String email1,String pass1) {
//	
//	WebElement txtmail = driver.findElement(By.id("email"));
//	txtmail.sendKeys(email1);
//	WebElement txtpass = driver.findElement(By.id("pass"));
//	txtpass.sendKeys(pass1);
//	}

