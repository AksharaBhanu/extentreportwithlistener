package day1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest{
	@Test
	public void testC()
	{
		Reporter.log("Hi this is testC",true);
	}

	@Test
	public void testD()
	{
		Reporter.log("Hi this is testD",true);
		Assert.fail("Something");
	}
}
