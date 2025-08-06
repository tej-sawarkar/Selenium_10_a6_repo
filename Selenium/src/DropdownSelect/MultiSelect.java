package DropdownSelect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/hp/Desktop/Select.html");
	WebElement month = driver.findElement(By.id("month"));
	Select monSelct=new Select(month);
	
	monSelct.selectByIndex(0);
	monSelct.selectByValue("f");
	monSelct.selectByVisibleText("mar");
	
	Thread.sleep(2000);
	monSelct.deselectByIndex(0);

}
}
