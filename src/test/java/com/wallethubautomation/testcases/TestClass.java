package com.wallethubautomation.testcases;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wallethubautomation.businessLogic.HomePageBL;
import com.wallethubautomation.businessLogic.LoginPageBL;
import com.wallethubautomation.common.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends BaseClass
{

	WebDriver driver;
	WebDriverWait wait ;
	
	@Test
	public void test() throws IOException, InterruptedException 
	{
	String status ="Hello World";
	driver=driverSetUp();
	driver.get(BaseClass.configReader("url"));
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver,2000);
	LoginPageBL.login(driver);
    HomePageBL.postStatus(driver, wait, status);
    driverClose();
	}
	}
	
