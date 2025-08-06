package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataWelComePage {
     //declaration
	@FindBy(linkText ="Register")
	private WebElement registerLink;
	
	//2nd element
	@FindBy(className = "ico-login")
	private WebElement LoginLink;
	
	//initialization only one time for single class
	public DataWelComePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//getter

	public WebElement getRegisterLink() {
		return registerLink;
	}
	//gatter for2nd element

	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	}


