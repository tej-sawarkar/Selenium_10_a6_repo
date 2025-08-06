package TestNgg;

import org.slf4j.helpers.Reporter;
import org.testng.annotations.Test;

public class ConfigurationAnnotion {
@Test
public void beforeSuits()
{
	org.testng.Reporter.log("@beforesuite",true);
}
@Test
public void demo()

{
	org.testng.Reporter.log("@testdemo",true);
}
public void aftersuit()

{
	org.testng.Reporter.log("@aftersuite",true);
}

}

