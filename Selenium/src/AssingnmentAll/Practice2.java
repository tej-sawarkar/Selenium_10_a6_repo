package AssingnmentAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
	}
}
