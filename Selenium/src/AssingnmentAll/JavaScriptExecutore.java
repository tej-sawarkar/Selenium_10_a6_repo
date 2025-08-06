package AssingnmentAll;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutore {
	public static void main(String[] args) throws InterruptedException, IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:/abhibus.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots" + timestamp + ".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
		
		driver.close();

	}
}
