package SeleniumMock;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MockTestt {
	@Test
	public void mock() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		driver.findElement(By.xpath("//div[@class='h-6 w-6 cursor-pointer']")).click();
        driver.findElement(By.xpath("//span[text()='Fantasy Cricket']")).click();
        
        driver.switchTo().frame(0);
        FileInputStream file=new FileInputStream("./TestData/Commondata.properties");
        Properties prop=new Properties();
         prop.load(file);
         Thread.sleep(2000);
         
         String monum= prop.getProperty("mobileNo");
         driver.findElement(By.id("regEmail")).sendKeys(monum);
         Thread.sleep(2000);
      
          driver.findElement(By.name("loginsubmit")).click();
          
          driver.switchTo().parentFrame();
          
          Actions act=new Actions(driver);
          WebElement ele = driver.findElement(By.linkText("About Us"));
          act.scrollToElement(ele).perform();
          ele.click();
          
          Set<String> news = driver.getWindowHandles();
          for(String id:news) 
          {
        	 driver.switchTo().window(id);
        	 String msg = driver.getTitle();
        	 System.out.println(msg);
          }
          
          driver.findElement(By.partialLinkText("Newsroom")).click();
          
     driver.findElement(By.id("changebrand"));
     
         
        
	}
}
