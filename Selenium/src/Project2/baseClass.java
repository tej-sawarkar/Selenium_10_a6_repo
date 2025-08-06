package Project2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver driver;

	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FileInputStream fis = new FileInputStream("./TestData/Commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
	}
	

	@BeforeMethod
	public void login() throws IOException {
		WelcomeWebElementProject2 wwep = new WelcomeWebElementProject2(driver);
		wwep.getWelcomePage().click();
		
		FileInputStream fis=new FileInputStream("./TestData/Commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String email = prop.getProperty("email");
		
		String password = prop.getProperty("password");
		
		LoginPageElement lpg=new LoginPageElement(driver);
		lpg.getEmailfield().sendKeys(email);
		lpg.getPasswordField().sendKeys(password);
		lpg.LogInButton.click();
		
	}
}
