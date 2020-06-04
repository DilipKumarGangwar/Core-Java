/*Inner class  - are  Classes within  another class
Inner class can have:
-   Instance variables/class variables
-   Methods
-   Can be used to make the Outer class (like they are used in Builder Design pattern)
 */


class Outer1{
	
	int a;
	
	void display() {
		System.out.println("I am in outer class 1");
	}
	class Inner1{       //Inner class             Outer$Inner.class
		
		void display() {
			System.out.println("I am in Inner class 1");
		}
		
	}
	
}


class Outer2{
	
	int a;
	
	void display() {
		System.out.println("I am in outer class 2");
	}
	static class Inner2{         //static inner class
		
		void display() {
			System.out.println("I am in Inner class 2 which is  static ");
		}
		
	}
	
}

public class InnerClassDemo {
	public static void main(String args[]) {
		
		Outer1 out1 = new Outer1();
		
		out1.display();  //call outer class 1 display
		Outer1.Inner1 in1 = out1.new Inner1();         //access inner class (object via outer class object out1
		in1.display();   // call inner class  1 display
		
		
        Outer2 out2 = new Outer2();
		
		out2.display();  //call outer class 2 display
		//Outer2.Inner2 in2 = out2.new Inner2();
		Outer2.Inner2 in2 = new Outer2.Inner2();      //create  inner class object which is static 
		in2.display();   // call inner class 2 display
	}

}
