
class A{
	
	A(){
		System.out.println("In Default constructor A");
	}
	A(int x)
	{
		System.out.println("In Parameterized constructor A");
	}
}


class B extends A{
	
	B(){
		super();   //default method in subclass
		System.out.println("In Default constructor B");
	}
	B(int x)
	{
		super();   //default method in subclass
		System.out.println("In Parameterized constructor B"+x);
	}
}

class C extends A{
	
	C(){
		//System.out.println("Called from Class C - Default constructor ");
		super(5);
		System.out.println("In Default constructor C");
	}
	C(int x)
	{
		super(x);
		System.out.println("In Parameterized constructor C with Parameter"+x);
	}
}


public class SuperDemo {
	public static void main(String args[]) {
		A a = new A();
		B b1 = new B();
		B b2 = new B(50);
		
		C c1 = new C();
		C c2 = new C(20);
		
		
		
	}
}
