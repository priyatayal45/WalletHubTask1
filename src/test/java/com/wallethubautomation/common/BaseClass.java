package com.wallethubautomation.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 

{
	static WebDriver driver;
	
	public static String configReader(String Parameter) throws IOException
	{
		String filename=System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\Config.Properties";
		FileInputStream file = new FileInputStream (filename);
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(Parameter);
		
	}
	
	public static WebDriver driverSetUp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		return driver;
	}
	
	public static void driverClose()
	{
		driver.quit();
	}
}
