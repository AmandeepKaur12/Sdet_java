package Sdet_Java;

public class Daythree_Assignment_ThisKeyword_Method {
	
	public void Method() {
		System.out.println("Default method");
	}
	
	public void Method1(int a) {
		System.out.println("One parameterized method");
		}
	
	public void Method2(int a,int b) {
		this.Method3(88,78,23);
		this.Method();
		System.out.println("two parameterized method" );
		this.Method4(3, 4,6, 9);
		this.Method1(97);
	}
	
	public void Method3(int a,int b,int c) {
		System.out.println("three parameterized method" );
	}
	
	public void Method4(int a,int b,int c,int d) {
		System.out.println("four parameterized method" );
	}
	
	public static void main(String[] args) {
		Daythree_Assignment_ThisKeyword_Method m = new Daythree_Assignment_ThisKeyword_Method();
		m.Method2(98, 56);
		
	}

}
