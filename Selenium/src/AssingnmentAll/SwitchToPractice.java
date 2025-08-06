package AssingnmentAll;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class SwitchToPractice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allwindowid = driver.getWindowHandles();
		for(String id:allwindowid) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/nopCommerce"));
		break;
			}
         driver.findElements(By.xpath("//span[text()='Create new account']/../../../../../../"));
	}
}