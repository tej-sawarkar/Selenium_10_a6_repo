package AssingnmentAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorkAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//welcomepage
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("Log in")).click();
		
		//login page
		driver.findElement(By.id("Email")).sendKeys("asdfg@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("a12345");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//homepage
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(1000);
		
	}
}
