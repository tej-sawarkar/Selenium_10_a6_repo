package ScreenSshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.MoreObjects.ToStringHelper;

import net.bytebuddy.implementation.ToStringMethod;

public class ToLearnTakeSS {
	public static void main(String[] args) throws IOException {
	 String timestamp = LocalDateTime.now().toString().replace(":","-");
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ScreenShots/"+timestamp+".png");
	org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}
}
