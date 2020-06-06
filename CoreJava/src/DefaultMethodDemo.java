/*
 * Default keyword help to  define a method in interface
 * That default method can be overriden in implementing class if needed
 * 
 */

interface Fun{
	void display();
	default void show() {             //this method can be overridden in Implementing class if we want to do
		System.out.println("Hello");
	}
	
	
}

class Implementing implements Fun{
	
	public void display() {
	  System.out.println("In implementing class");
	}
	
	@Override
	public void show() {
		 System.out.println("Overrided show() of superclass");
	}
	
	
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		Fun fun=new Implementing();
		fun.display();
		fun.show();
		

	}

}
