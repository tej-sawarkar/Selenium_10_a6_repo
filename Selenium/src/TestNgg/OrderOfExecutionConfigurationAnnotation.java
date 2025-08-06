package TestNgg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExecutionConfigurationAnnotation {
@BeforeSuite
public void beforeSuit() {
	Reporter.log("beforeSuit execte",true);
}
@BeforeTest
public void beforeTest() {
Reporter.log("beforetest",true);
}
@BeforeClass
public void beforeclass() {
Reporter.log("beforeclass",true);
}
@Test
public void demo() {
	Reporter.log("demoexecute",true);
}
@AfterClass
public void afterclass() {
Reporter.log("afterclass",true);
}

@AfterTest
public void afterTest() {
Reporter.log("after",true);
}
@AfterSuite
public void AfterSuit() {
Reporter.log("after",true);
}
}