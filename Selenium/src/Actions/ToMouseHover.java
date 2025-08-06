package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	WebElement HoverEle = driver.findElement(By.xpath("//span[text()='Electronics']"));
	
	Actions act=new Actions(driver);
	//act.moveToElement(HoverEle).perform();
	act.moveByOffset(483,154).perform();
}
}
