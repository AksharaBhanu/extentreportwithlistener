package day1;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ITestListener
{
	public static ExtentReports extent;
	public ExtentTest eTest;
	  public void onStart(ITestContext context) {
			extent = new ExtentReports();
		    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		    extent.attachReporter(spark);
	  }
	  
	  public void onTestStart(ITestResult result) {
		  eTest = extent.createTest(result.getName());
	  }

	
	  public void onTestFailure(ITestResult result) {
		  String failmsg=result.getThrowable().getMessage();
		eTest.fail(failmsg);
	  }

	

	  public void onFinish(ITestContext context) {
		  extent.flush();
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}
