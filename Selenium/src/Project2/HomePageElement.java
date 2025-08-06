package Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement {
	//pom page for store element of book
	@FindBy(partialLinkText = "Books")
	public WebDriver booksLink;
	
	@FindBy(partialLinkText = "Computers")
	public WebDriver computerLink;
	
	@FindBy(partialLinkText = "Electronics")
	public WebDriver electronicsLink;

	public HomePageElement(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	public WebDriver getBooksLink() {
		return booksLink;
	}

	public WebDriver getComputerLink() {
		return computerLink;
	}

	public WebDriver getElectronicsLink() {
		return electronicsLink;
	}

}
	

