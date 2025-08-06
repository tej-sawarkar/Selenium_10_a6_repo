package AssertionS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnHardAssertion {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "login page is not displayed");
		Reporter.log("login page is displayed", true);

		driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "home page is not displayed");
		Reporter.log("home page is displayed", true);

	}
}
