package com.w2a.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rakes\\workspace\\WebDriverMaven\\src\\test\\resources\\executables\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("grakesh628@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("Vault12#");
		driver.findElement(By.id("SingIn")).click();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
