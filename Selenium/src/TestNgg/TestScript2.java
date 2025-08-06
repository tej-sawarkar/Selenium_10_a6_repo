package TestNgg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
@Test
public void clickonComputer() {
	driver.findElement(By.partialLinkText("Computers")).click();
	if(driver.getTitle().equals("Demo Web Shop.Books")) {
		Reporter.log("book page is displayed",true);
	}else {
		Reporter.log("book page is not displayed",true);
	}
	}
}

