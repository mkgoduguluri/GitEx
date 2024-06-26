package test;

public class O3 extends O4 {
	
	int a;
	
	public O3(int a) {
		super(a);
		this.a = a;
	}
	public int add() {
		
		a = a+1;
		return a;
	
	}
	public int subtract() {
		
		a = a-1;
		System.out.println(a);
		return a;
	}

}
