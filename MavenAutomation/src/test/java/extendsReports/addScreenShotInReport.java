package extendsReports;

import java.io.ObjectInputFilter.Status;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class addScreenShotInReport {
	@Test
	public void addasacreenshot() {
		//add time stamp for multiple screenshot
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screenShot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ScreenshotReport.html");
		ExtentReports ereport=new ExtentReports();
		ereport.attachReporter(spark);
		ExtentTest test = ereport.createTest("addScreenshot");
		test.log(com.aventstack.extentreports.Status.INFO,"adding screenshot");
		test.addScreenCaptureFromBase64String(screenShot);
		ereport.flush();
		
	}

}
