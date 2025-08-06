package Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentForInstagramProperty {
public static void main(String[] args) throws IOException {
	//1st store url pass on peoperties file nd cl
	FileInputStream file=new FileInputStream("./TestData/Commondata.properties");
	Properties prop = new Properties();
	prop.load(file);
	prop.load(file);
	String url2 = prop.getProperty("url2");
	System.out.println(url2);
	
	String password2 = prop.getProperty("password2");
	//System.out.println(password2);
	String email2 = prop.getProperty("email2");
	//System.out.println(email2);

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url2);
	
	//2nd save all on pom class and cl 
	AssingmentData ad=new AssingmentData(driver);
	ad.getUserText().sendKeys("abcd");
	ad.getPasswordFild().sendKeys("abcd@123");
	ad.getLoginClik().click();
}
}
