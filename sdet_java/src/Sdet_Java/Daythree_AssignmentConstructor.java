package Sdet_Java;

public class Daythree_AssignmentConstructor {
	
	public Daythree_AssignmentConstructor() {
		System.out.println("Default parameterized constructor");
	}
	
	public Daythree_AssignmentConstructor(int a) {
		this();
		System.out.println("One parameterized constructor" );
	}
	
	public Daythree_AssignmentConstructor(int a,int b) {
		System.out.println("two parameterized constructor" );
	}
	
	public Daythree_AssignmentConstructor(int a,int b,int c) {
		System.out.println("three parameterized constructor" );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daythree_AssignmentConstructor dtac = new Daythree_AssignmentConstructor(1,3,4);
		Daythree_AssignmentConstructor dtac1 = new Daythree_AssignmentConstructor(1);
		Daythree_AssignmentConstructor dtac12 = new Daythree_AssignmentConstructor(1,4);

	}

}
