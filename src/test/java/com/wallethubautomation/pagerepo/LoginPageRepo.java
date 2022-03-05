package com.wallethubautomation.pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wallethubautomation.common.BaseClass;

public class LoginPageRepo 

{
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

	
	
	
	
	
}
