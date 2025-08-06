package DropdownSelect;

import java.time.Duration;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetSelectedOption {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/hp/Desktop/Select.html");
	
	WebElement month = driver.findElement(By.id("month"));
	
	Select monSel=new Select(month);
	monSel.selectByIndex(0);
	monSel.selectByIndex(1);
	monSel.selectByIndex(3);
	
	
	
}
}