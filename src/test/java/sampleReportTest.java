import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampleReportTest {

	ExtentReports reports;
	
	@BeforeSuite
	public void bs() {
		
		//spark report config
				ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
				spark.config().setDocumentTitle("CRM TEST SUITE TITLE");
				spark.config().setReportName("CRM REPORT");
				spark.config().setTheme(Theme.DARK);
				
				//add Env information& create test
				
				reports=new ExtentReports();
				reports.attachReporter(spark);
				reports.setSystemInfo("OS", "WINDOWS10");
				reports.setSystemInfo("Browser", "Chrome");
				
	}
	
	@AfterSuite
	public void as() {
		
		reports.flush();
	}
	@Test
	public void createContactTest() {
		
		ExtentTest test = reports.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		
		if("HDFC".equals("HDFC"))
		{
			test.log(Status.PASS, "contact is created");
		}
		else
		{
			test.log(Status.FAIL, "contact is not created");
		}
		
		reports.flush();
	}
	
	@Test
	public void createContactTes() {
		
		ExtentTest test = reports.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		
		if("HDFC".equals("HDFC"))
		{
			test.log(Status.PASS, "contact is created");
		}
		else
		{
			test.log(Status.FAIL, "contact is not created");
		}
		
		reports.flush();
	}
	
	@Test
	public void createContactTe() {
		
		ExtentTest test = reports.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		
		if("HDFC".equals("HDFC"))
		{
			test.log(Status.PASS, "contact is created");
		}
		else
		{
			test.log(Status.FAIL, "contact is not created");
		}
		
		reports.flush();
	}
}
