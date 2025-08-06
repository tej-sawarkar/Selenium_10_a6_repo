package MiniProjectPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataWelcomePageMini {
	  //pom we save register welcome page element snd register page element in different pom page
	  //declaration
		@FindBy(linkText ="Register")
		private WebElement registerLink;
		
		
		//initialization only one time for single class (constructor)
		public DataWelcomePageMini(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//getter

		public WebElement getRegisterLink() {
			return registerLink;
		}
		
		}
		
		


