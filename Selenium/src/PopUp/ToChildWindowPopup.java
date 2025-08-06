package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://shoppersstack.com/products_page/30");
		driver.findElement(By.id("compare")).click();

		Set<String> allwindowId = driver.getWindowHandles();// 1
		for (String id : allwindowId) {
			driver.switchTo().window(id);// 2
			String acturl = driver.getCurrentUrl();
			if (acturl.contains("flipkart")) {
				driver.manage().window().maximize();
				break;
			}
		}
		
	}
}
