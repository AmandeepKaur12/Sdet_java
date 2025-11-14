package Sdet_Java;

public class Daytwo_Assignment2_Class_pillars {
	
	public int Addition(int a, int b) {
		int c = a + b;
		System.out.println("Result of Sum of two numbers is : " + c );
		return c;
	}
	
	public int Subtract(int x, int y) {
		int z = x - y;
		System.out.println("Result of Subtraction of two numbers is : " + z );
		return z;
	}
	
	public int Multiplication(int l, int m) {
		int n = l*m;
		System.out.println("Result of multiplication of two numbers is : " + n );
		return n;
	}
	
	public void Divison(int i, int j) {
		int k = i/j;
		System.out.println("Result of Division of two numbers is : " + k );
	}

	public static void main(String[] args) {
		
		Daytwo_Assignment2_Class_pillars cp = new Daytwo_Assignment2_Class_pillars();
		int sumresult = cp.Addition(10, 2);
		int sumresult1 = cp.Addition(sumresult, 2);
		int subresult = cp.Subtract(sumresult1, 2);
		int mulresult = cp.Multiplication(subresult, 2);
		cp.Divison(mulresult, 2);

	}

}
