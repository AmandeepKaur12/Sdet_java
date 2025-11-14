package Sdet_Java;

public class Daytwo_Assignment2_part2_Class_pillars {
	
	
	
	public int Multiplication(int l, int m) {
		int n = l*m;
		System.out.println("Result of multiplication of two numbers is : " + n );
		return n;
	}
	
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
	
	public void Divison(int i, int j) {
		int k = i/j;
		System.out.println("Result of Division of two numbers is : " + k );
	}

	public static void main(String[] args) {
		
		Daytwo_Assignment2_part2_Class_pillars cp = new Daytwo_Assignment2_part2_Class_pillars();
		int multiplicationresult = cp.Multiplication(10, 3);
		int sumresult = cp.Addition(multiplicationresult, 2);
		int multiplicationresult1 = cp.Multiplication(sumresult, 4);
		int subresult = cp.Subtract(multiplicationresult1, 4);
		cp.Divison(subresult, 2);
		

	}

}
