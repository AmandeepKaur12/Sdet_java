package Sdet_Java;

public class Dayone_Assignment1_Class_Student {
	
	int age;
	int rollno;
	
	public void display1() {
		System.out.println("This is method one to display age" + " " + age);
	}
	
	public void display2() {
		System.out.println("This is method second to display rollno." + " " + rollno);
	}

	public static void main(String[] args) {
		Dayone_Assignment1_Class_Student dacs = new Dayone_Assignment1_Class_Student();
		dacs.age = 34;
		dacs.rollno =3;
		
		dacs.display1();
		dacs.display2();
		
		Dayone_Assignment1_Class_Student dacs1 = new Dayone_Assignment1_Class_Student();
		dacs1.age = 74;
		dacs1.rollno = 23;
		
		dacs1.display1();
		dacs1.display2();
		

	}

}
