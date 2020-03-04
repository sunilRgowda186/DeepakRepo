package dps;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA 
{
	
	@Test
	public void tc_o1()
	{
		Reporter.log("Welcome to Git",true);
	}
	@Test
	public void tc_o2()
	{
		Reporter.log("Deepak",true);
	}

}
