package TestNgBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ntorque {
	@Test(groups="integration")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ntorque.com/");
		org.testng.Reporter.log("ntorque launcg",true);
}
}
