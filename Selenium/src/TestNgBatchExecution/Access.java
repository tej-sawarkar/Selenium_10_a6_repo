package TestNgBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Access {
@Test(groups="smoke")
public void launch() {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.access.com/");
	org.testng.Reporter.log("access launcg",true);
}
}
