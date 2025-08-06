package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropetyFile {
	public static void main(String[] args) throws IOException {
		// step1:create FileInputStream
		FileInputStream file = new FileInputStream("./TestData/Commondata.properties");

		// step2:create respective filrtype object
		Properties prop = new Properties();

		// call read method
		prop.load(file);
		String url = prop.getProperty("url");
		System.out.println(url);

		// prop.load(file);
		String password = prop.getProperty("password");
		System.out.println(password);

		// prop.load(file);
		String email = prop.getProperty("email");
		System.out.println(email);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password );
		

	}
}
