package Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class WelcomeWebElementProject2 {
	@FindBy(linkText = "Log in")
	private WebElement welcomePage;

	public WelcomeWebElementProject2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWelcomePage() {
		return welcomePage;
	}

}
