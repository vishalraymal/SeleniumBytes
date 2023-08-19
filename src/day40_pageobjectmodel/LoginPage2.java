package day40_pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	//webdriver instace
	WebDriver driver;
	
	//constructor
	public LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  // additionlal statement
	}
	
	//Locators
	//@FindBy(xpath="//div[@id='divLogo']//img") 
	//WebElement img_logo;
	
	@FindBy(how=How.XPATH, using="//div[@id='divLogo']//img")    // another appraoch
	WebElement img_logo;
	
	
	@FindBy(id="txtUsername")
	WebElement txt_username;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
		
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btn_login;
		
		
	//Action steps/methods
	public boolean checkLogoPresence()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
	
	public void setUserName(String name)
	{
		txt_username.sendKeys(name);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	}

