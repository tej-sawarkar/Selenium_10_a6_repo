package TestNgBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bugatti {
	@Test(groups="integration")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bugatti.com/");
		org.testng.Reporter.log("bugatti launcg",true);
	}

}
