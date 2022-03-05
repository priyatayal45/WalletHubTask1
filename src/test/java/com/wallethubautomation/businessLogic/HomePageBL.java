package com.wallethubautomation.businessLogic;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wallethubautomation.pagerepo.HomePageRepo;

public class HomePageBL {
	static JavascriptExecutor js;

	public static void postStatus(WebDriver driver, WebDriverWait wait, String status) throws InterruptedException {
		HomePageRepo homepagerepo = PageFactory.initElements(driver, HomePageRepo.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(homepagerepo.getElement(driver, "homeLink")));
		homepagerepo.getHomeLink().click();
		wait.until(ExpectedConditions.presenceOfElementLocated(homepagerepo.getElement(driver, "cmtSection")));
		js = (JavascriptExecutor) driver;
		try {
			js.executeScript("window.scrollBy(0,200)");
			//wait.until(ExpectedConditions.presenceOfElementLocated(homepagerepo.getElement(driver, "statusLine")));
			if (homepagerepo.getPostStatus().getText().equals(status)) {
				homepagerepo.getActionBtn().click();
				wait.until(ExpectedConditions.presenceOfElementLocated(homepagerepo.getElement(driver, "postdeleteBtn")));
				homepagerepo.getDelPost().click();
				homepagerepo.getDelBtn().click();
			}
		} catch (Exception e) {
			System.out.println("Post is new");
		} finally {
			wait.until(ExpectedConditions.elementToBeClickable(homepagerepo.getLabelText()));
			homepagerepo.getLabelText().click();
			wait.until(ExpectedConditions.presenceOfElementLocated(homepagerepo.getElement(driver, "commentarea")));
			homepagerepo.getTextarea().sendKeys(status);
			homepagerepo.getPostBtn().click();
			try {
				if(homepagerepo.getErrorMsg().isDisplayed())
				{
					homepagerepo.getCloseBtn().click();
					System.out.println("Same status has been earlier posted");
				}
			} catch (Exception e) {
				System.out.println("Post is not identical");
			}
		}

	}

}
