package AssingnmentAll;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTricentiesFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.linkText("Facebook")).click();

		Set<String> allwindowId = driver.getWindowHandles();

		for (String id : allwindowId) {
			driver.switchTo().window(id);
			String crturl = driver.getCurrentUrl();
			if (crturl.equals("https://www.facebook.com/nopCommerce"))
				
			break;
		}
		Thread.sleep(2000);
		String background = driver.findElement(By.xpath("//span[text()='Create new account']/../../../../.."))
				.getCssValue("background-color");
		System.out.println(background);
		driver.findElement(By.xpath("//span[text()='Create new account']/../../../../..")).click();
		Set<String> newwindowId = driver.getWindowHandles();
		for (String id : newwindowId) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains("https://www.facebook.com/reg/")) {
				break;
			}
		}
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//button[text()='Sign Up']")).isDisplayed();
		System.out.println(status);
		driver.close();
	}
	}

