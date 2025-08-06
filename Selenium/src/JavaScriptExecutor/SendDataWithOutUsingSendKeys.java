package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDataWithOutUsingSendKeys {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
    WebElement searchTf = driver.findElement(By.id("small-searchterms"));
    
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].value='mobile'",searchTf);
}
}
