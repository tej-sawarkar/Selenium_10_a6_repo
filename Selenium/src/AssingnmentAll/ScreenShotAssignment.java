package AssingnmentAll;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotAssignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	Set<String> windowId = driver.getWindowHandles();
	for( String id:windowId){
		driver.switchTo().window(id);
		String crnturl = driver.getCurrentUrl();
		//if(crnturl.)
		
	}
	
	
}
}
