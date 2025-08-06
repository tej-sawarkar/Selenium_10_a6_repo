package Project2;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
	@FindBy(id = "Email")
	public WebElement EmailField;

	@FindBy(id = "Password")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement LogInButton;

	public LoginPageElement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailfield() {
		return EmailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLogInButton() {
		return LogInButton;
	}
   
	

}
