package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P3 {
	@Test(dataProvider = "getData")
	public void carLoanMethod01(String username, String Password) {

		System.out.println("carLoanMethod01");
		System.out.println(username);
		System.out.println(Password);
	}

	@Test(enabled = false)
	public void carLoanMethod02() {

		System.out.println("carLoanMethod02");
	}
	@Parameters({"value"})
	@Test(groups= {"Reg"})
	public void carLoanMethod03(String name) {

		System.out.println("carLoanMethod03");
		System.out.println(name);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] d = new Object[3][2];
		
		d[0][0] = "Manoj";
		d[0][1] = "949";
		d[1][0] = "Kumar";
		d[1][1] = "183";
		d[2][0] = "Goduguluri";
		d[2][1] = "6390";
		
		return d;
	}

}
