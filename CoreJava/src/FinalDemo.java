
//  *********************Final with variables*************************
class Example1{
	int x=5;
	final int Y=20;      //y is constant 
	Example1(){
		x=10;       //ok 
		//Y=200;    wrong as final is constant 
		
		
	}
	void display() {
		System.out.println("x="+x + " " + "Y="+Y);
	}
}

//  *********************Final Class*************************
final class Example2{            //final class 
	
	void display() {
		System.out.println("Hello");
	}
}

//class XYZ extends Example2{       As Example2 is final so that class cannot be inherited
//	
//	
//}


//********************Final Method*****************\

class sample1{
	final void display() {                // display() is final,  as we donot want subclass to override it
		System.out.println("World");
	}
	
	
}


class sample2 extends sample1{
//	@Override
//	void display() {                                          // Cannot override it as display is final in superclass Sample1
//		System.out.println("I am overriding superclass method :) ");
//	}
	
}
public class FinalDemo {

	public static void main(String[] args) {
		
        //final with Variables  
		Example1 a=new Example1();
          a.display();
          
        //With class
//       XYZ x = new XYZ();       This works without id Example2 is not final
//       x.display();
          
          
         //with Methods
          /*when Superclass  do not want Subclass  to override its methods, then superclass makes its
          Method asMethod final  */
          
	}

}
