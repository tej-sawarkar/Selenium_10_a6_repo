package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataPageForStale {

	@FindBy(id = "small-searchterms")
	private WebElement searchTf;
	
	public DataPageForStale(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchTf() {
		return searchTf;
	}
	
}
