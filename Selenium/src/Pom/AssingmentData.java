package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssingmentData {
	@FindBy(name = "username")
	private WebElement UserText;
	
	@FindBy(name="password")
	private WebElement PasswordFild;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginClik;

	public AssingmentData(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserText() {
		return UserText;
	}

	public WebElement getPasswordFild() {
		return PasswordFild;
		
	}

	public WebElement getLoginClik() {
		return LoginClik;
	}

	
	}


