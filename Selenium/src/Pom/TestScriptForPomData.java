package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptForPomData {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demowebshop.tricentis.com/");
	DataWelComePage wp=new DataWelComePage(driver);
	wp.getLoginLink().click();
	
	//for login create new refver because data store in diff class
	DataForLogIn lp=new DataForLogIn(driver);
	lp.getEmail().sendKeys("abcd@gmail.com");
	
}
}
