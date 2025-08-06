package AssingnmentAll;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.Select;

public class AssignmentForIframe {
	public static void main(String[] args) throws InterruptedException, IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");

		driver.switchTo().frame(0);// switching to iframe
		driver.findElement(By.name("Montana")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();// switching back to main webpage
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("user")).sendKeys("abcd1122@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345671122@abc");
		driver.findElement(By.id("cpass")).sendKeys("12345671122@abc");
		driver.findElement(By.id("firstName")).sendKeys("teja1122");
		driver.findElement(By.id("lastName")).sendKeys("shrikant1122");
		driver.findElement(By.id("phone")).sendKeys("88883555671122");
		Thread.sleep(2000);
		// dropdown
		WebElement FordropDown = driver.findElement(By.id("user-type"));// find fild 1st where u want to dropdown
		Select otherSel = new Select(FordropDown);
		otherSel.selectByVisibleText("Pet Owner");
		Thread.sleep(2000);
		// check box
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='Register']")).click();// for singup
		// screenshot
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File temp1 = tss.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShots/" + timestamp + ".png");
		org.openqa.selenium.io.FileHandler.copy(temp1, dest1);
	}
}
