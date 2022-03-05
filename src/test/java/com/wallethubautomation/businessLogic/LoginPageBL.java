package com.wallethubautomation.businessLogic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.wallethubautomation.common.BaseClass;
import com.wallethubautomation.pagerepo.LoginPageRepo;

public class LoginPageBL
{

	public static void login(WebDriver driver) throws IOException
	{
		
		LoginPageRepo loginpagerepo=PageFactory.initElements(driver,LoginPageRepo.class );
		loginpagerepo.getUsername().sendKeys(BaseClass.configReader("username"));
		loginpagerepo.getPassword().sendKeys(BaseClass.configReader("password"));
		loginpagerepo.getLoginBtn().click();
	}
}
