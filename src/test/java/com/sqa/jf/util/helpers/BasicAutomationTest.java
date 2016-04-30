package com.sqa.jf.util.helpers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicAutomationTest {
	private String baseURL = "http://google.com";
	Properties devProps;
	String devPropsLocation = "src/main/resources/dev.properties";
	Properties sharedMapUI;
	String sharedMapUILocation = "src/main/resources/shared-map-ui.properties";

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void loadProperties() {
		this.sharedMapUI = ConProperties.loadProperties(this.devPropsLocation);
		this.devProps = ConProperties.loadProperties(this.devPropsLocation);
	}

	@Test(priority = 1)
	public void setUpTest() {
		// Set up Web Driver
		WebDriver driver = new FirefoxDriver();
		// Go to web page destinated for BaseURL class field
		driver.get(this.baseURL);
	}

	@Test(dataProvider = "dp", priority = 50)
	public void test(Integer n, String s) {
		System.out.println("Test " + n);
	}
}
