package TestNgBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activa {
	@Test(groups="regression")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.activa.com/");
		org.testng.Reporter.log("activa launcg",true);
}
}
