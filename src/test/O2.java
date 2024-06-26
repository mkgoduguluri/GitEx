package test;

import org.testng.annotations.Test;

public class O2 extends O1{
	
	
	int a = 3;
	@Test
	public void method01() {
		
		System.out.println("Method 01");
		method02();
		O3 bg = new O3(a);
		System.out.println(bg.add());
		System.out.println(bg.multiply());
		
		
	}

}
