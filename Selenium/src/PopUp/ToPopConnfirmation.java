package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPopConnfirmation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.name("submit")).click();
	Alert popup = driver.switchTo().alert();
	popup.accept();
	Thread.sleep(2000);
	//String text = driver.switchTo().alert().getText(); ----correct also
	//System.out.println(text);
	System.out.println(popup.getText());//----sir method
	popup.accept();
}
}

