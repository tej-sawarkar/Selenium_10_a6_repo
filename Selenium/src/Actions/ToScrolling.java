package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScrolling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.dream11.com/");
	WebElement scroll = driver.findElement(By.linkText("About Us"));
	
	Actions act=new Actions(driver);
    //	act.scrollToElement(scroll).perform();//for scrollByElement
	act.scrollByAmount(0,1500).perform();//for known positin
}
}
