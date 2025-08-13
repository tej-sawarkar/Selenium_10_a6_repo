package extendsReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtendReport {
@Test
public void createReport() {
	String timestamp = LocalDateTime.now().toString().replace(":", "-");
	//1:ExtendSparkReporte object
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtentReport_"+timestamp+".html");
	
	//2:create ExtentReportObject
	ExtentReports ereport=new ExtentReports();
	
	//3:attach extendsSparkReporter to extendReports
	ereport.attachReporter(spark);
	
	//4:create ExtendTest object
	ExtentTest test = ereport.createTest("createReport");
	
	//5:call log
	test.log(Status.PASS,"message added into report");
	
	//6:call flush
	ereport.flush();
}
}
