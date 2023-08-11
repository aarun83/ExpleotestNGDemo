package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest2 {
private WebDriver driver;
	
	@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun Kumar\\eclipse-workspace\\Sample_Cucumber_Demo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
  @Test
  public void Test1() {
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  
	  String title = driver.getTitle();
	 AssertJUnit.assertTrue(title.equals("Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
	  driver.quit();
	    }

}
