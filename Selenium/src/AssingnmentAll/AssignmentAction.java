package AssingnmentAll;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentAction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	
	driver.findElement(By.linkText("Right Click")).click();
  //  WebElement btnRightClk = driver.findElement(By.id("btn"));
   // Actions act=new Actions(driver);
     //act.contextClick(btnRightClk).perform();
     //driver.findElement(By.xpath("//button[text()='Yes']")).click();
}
}
