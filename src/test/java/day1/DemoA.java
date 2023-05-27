package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest{
	@Test
	public void testA()
	{
		Reporter.log("Hi this is testA",true);
	}

	@Test
	public void testB()
	{
		Reporter.log("Hi this is testB",true);
	}
}
