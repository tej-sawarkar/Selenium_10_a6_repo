package DropdownSelect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForSelect {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.dream11.com/");
	
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("send-sms-iframe");
	WebElement dreamFrame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
	driver.switchTo().frame(dreamFrame);
	driver.findElement(By.id("regEmail")).sendKeys("123456789");
	//driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123456789");
	//driver.findElement(By.xpath("//a[text()='GET APP LINK']")).click();
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	driver.findElement(By.id("hamburger")).click();   }
}
