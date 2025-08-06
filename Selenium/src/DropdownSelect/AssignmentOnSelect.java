package DropdownSelect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSelect {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://x.com");
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	WebElement year = driver.findElement(By.id("SELECTOR_3"));
	Select yearSel=new Select(year);
	
	int lastIndex =yearSel.getOptions().size()-1;
	yearSel.selectByIndex(lastIndex);
	
}
}
