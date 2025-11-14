package Sdet_Java;

public class Day4_DebuggingClass {

	int age;
	int rollno;
	
	public void display1() {
		System.out.println("Function one");
		int valueage= age/10;
		System.out.println("This is method one to display age" + " " + valueage);
	}
	
	public void display2() {
		System.out.println("This is method second to display rollno." + " " + rollno);
	}

	public static void main(String[] args) {
		Day4_DebuggingClass dacs = new Day4_DebuggingClass();
		dacs.age = 34;
		dacs.rollno =3;
		
		dacs.display1();
		dacs.display2();
		
		Day4_DebuggingClass dacs1 = new Day4_DebuggingClass();
		dacs1.age=78;
		dacs1.rollno = 23;
		
		dacs1.display1();
		dacs1.display2();

}
}
