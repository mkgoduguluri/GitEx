package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P1 {
	@Parameters({"name"})
	@Test(dependsOnMethods= {"personalLoanMethod02"})
	public void personalLoanMethod01(String name) {

		System.out.println("personalLoanMethod01");
		System.out.println(name);
	}

	@Test(groups= {"Reg"})
	public void personalLoanMethod02() {

		System.out.println("personalLoanMethod02");
	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("After Suite");
	}

}
