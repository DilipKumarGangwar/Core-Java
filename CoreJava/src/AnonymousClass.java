// Anonymous class-Class with no name
class ABC{
	void show() {
		System.out.println("Hello");
	}
	
}

//class sample extends ABC{
//	   void show() {
//		System.out.println("World");
//	   }
//}
public class AnonymousClass {

	public static void main(String[] args) {
//		ABC a = new  sample();              //ok
//		a.show();                           // ok
		
		//Sample class just overrides show() of class ABC and nothing else, so we go for Anonymous class
		
		ABC abc = new ABC() 
		                 {
								void show() {
									System.out.println("World");
								}
		                 };
		 
		abc.show();                 

	}

}
