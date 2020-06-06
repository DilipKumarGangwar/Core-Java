//Lamda Expression used with Functional Interface (Single method Interface)  

@FunctionalInterface
interface Reader{
	void read();
}


public class LamdaExpression {

	public static void main(String[] args) {
//		 Reader r = new Reader() {
//	            public void read(){
//			           	System.out.println("I am Reading ");
//			         	System.out.println("Do not disturb Please");
//	            }
//
//          };
//		
//         Instead of above commented part, we can write this way also using Lamda Expression		
         Reader r = ()-> {
			
			                 	System.out.println("I am Reading ");
			                 	System.out.println("Do not disturb Please");
				
			              };
			              
	     	              
		                
		r.read();
		
	}    //end of main
}  //end of class
