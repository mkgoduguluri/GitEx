package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P4 {
	@Test(groups= {"Reg"})
	public void homeLoanMethod01() {
		
		System.out.println("homeLoanMethod01");
	}
	@Test(timeOut = 4000)
	public void homeLoanMethod02() {
		
		System.out.println("homeLoanMethod02");
	}
	@Parameters({"name"})
	@Test
	public void homeLoanMethod03(String name) {
		
		System.out.println("homeLoanMethod03");
		System.out.println(name);
	
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

}
