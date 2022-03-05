package com.wallethubautomation.pagerepo;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageRepo

{
	static By by;
	@FindBy(xpath = "//a[@aria-label='Home']")
	WebElement homeBtn;

	@FindBy(xpath = "(//div[@role=\"feed\"]/div[@data-pagelet=\"FeedUnit_0\"]//div)[39]")
	WebElement postStatusText;

	@FindBy(xpath = "//div[@aria-label=\"Actions for this post\"]")
	WebElement actionBtn;

	@FindBy(xpath = "//span[text()='Delete post']")
	WebElement delPost;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement delBtn;

	@FindBy(xpath = "//span[contains(text(),\"What's on your mind\")]")
	WebElement labelText;

	@FindBy(xpath = "//br[@data-text=\"true\"]//parent :: span")
	WebElement textarea;

	@FindBy(xpath = "//span[text()='Post']")
	WebElement postBtn;

	@FindBy(xpath = "//div[contains(text(),'This status update is identical')]")
	WebElement errorMsg;
	
	@FindBy(xpath = "//form[@method=\"POST\"]//div[@aria-label=\"Close\"]")
	WebElement closeBtn;
	
	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getHomeLink() {
		return homeBtn;
	}

	public WebElement getPostStatus() {
		return postStatusText;
	}

	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDelPost() {
		return delPost;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

	public WebElement getLabelText() {
		return labelText;
	}

	public WebElement getTextarea() {
		return textarea;
	}

	public WebElement getPostBtn() {
		return postBtn;
	}
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	

	public static By getElement(WebDriver driver, String elementname) {

		switch (elementname) {
		
		case "homeLink": 
		{
			by = By.xpath("//a[@aria-label='Home']");
			break;
		}
		case "cmtSection":
		{
			by=By.xpath("//span[contains(text(),\"What's on your mind\")]");
			break;
		}
		
		case "postdeleteBtn":
		{
			by=By.xpath("//span[text()='Delete post']");
			break;
		}
		case "tagBtn":
		{
			by=By.xpath("//span[text()='Tag friends']");
			break;
		}
		case "statusLine":
		{
			by=By.xpath("(//div[@role=\"feed\"]/div[@data-pagelet=\"FeedUnit_0\"]//div)[39]");
			break;
		}
		case "commentarea":
		{
			by=By.xpath("//br[@data-text=\"true\"]//parent :: span");
			break;
		}	
		}
		return by;
	}

}
