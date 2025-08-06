package MiniProjectPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageElement {
	//here we store element and their address using locator
	//declaration
	@FindBy(id = "FirstName")
	private WebElement FirstNameTextField;

	@FindBy(id = "LastName")
	private WebElement LastNameTextField;

	@FindBy(id = "Email")
	private WebElement EmailTextField;

	@FindBy(id = "Password")
	private WebElement PasswordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordTextField;

	@FindBy(id = "register-button")
	private WebElement RegisterButton;
	
	//initialization
	public RegisterPageElement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getter()
	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	//getter()
	
}
