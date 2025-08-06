package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExplicitWait {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https:/shoppersstack.com/products_page/35");
	
	driver.findElement(By.id("Check Delivery")).sendKeys("560010");
	
	WebElement checkBtn = driver.findElement(By.id("Check"));
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
	wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
	checkBtn.click();
	
	}	
}
