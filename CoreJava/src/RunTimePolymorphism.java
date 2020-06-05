// Run time polymorphism (RTP)
//Polymorphism- Here overridden method show can take different form , i.e different forms will be invoked(of super/subclass)
//Run time- It depends on the type of object which the reference is pointing at, according to which the respective class method will 
//called, and this info is available at run time only.

//Dynamic dispatch is also achieved by RTP

class P{
	void show() {
		System.out.println("In P");
	}
	
}

class Q extends P{
	@Override               //this annotation helps to avoid run time error if we somehow write say show1() instead of show here
	void show() {
		System.out.println("In Q");
	}
}

class R extends P{
	@Override             
	void show() {
		System.out.println("In R");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		P p1 = new P();    // Not the run time polymorphism
		p1.show();
		P p2 = new Q();    //Achieving run time polymorphism, this linking is done at run time
		p2.show();    
		
		p2= new R();     // Now p2 points to R 's object  ( Dynamic dispatch)
		p2.show();
		
		
		
		

	}

}
