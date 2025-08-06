package TestNgBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lamborgini {
	@Test(groups="regression")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Lamborgini.com/");
		org.testng.Reporter.log("lombo launcg",true);
	}

}
