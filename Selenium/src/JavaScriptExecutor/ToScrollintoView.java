package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollintoView {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.dream11.com/");
	 //Thread.sleep(2000);
	 WebElement start = driver.findElement(By.xpath("//div[text()='How to ']"));
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",start);
	 Thread.sleep(2000);
	 driver.close();
}
}
