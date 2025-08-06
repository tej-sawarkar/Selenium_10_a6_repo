package DropdownSelect;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.MonthDay;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearngetOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://x.com");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		//WebElement day = driver.findElement(By.id("SELECTOR_1"));
		WebElement year = driver.findElement(By.id("SELECTOR_3"));
		
		Select yearSel = new Select(year);
		List<WebElement> allOption = yearSel.getOptions();
		System.out.println(allOption.size());
		System.out.println(allOption);
		for(WebElement ele:allOption) {
			System.out.println(ele.getText());
		}
		//driver.close();
	}
}