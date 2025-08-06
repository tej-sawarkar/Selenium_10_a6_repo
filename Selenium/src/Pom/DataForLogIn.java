package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataForLogIn {

	@FindBy(id ="Email")
	private WebElement Email;
	
	//ctrl+space
	public DataForLogIn(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	public WebElement getEmail() {
		return Email;
	}
	
		
}
	
	

