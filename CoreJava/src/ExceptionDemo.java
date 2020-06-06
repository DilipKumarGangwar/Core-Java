
public class ExceptionDemo {

	public static void main(String[] args) {
		int i=15, j=0;
		
		try{
		   int k=i/j;    //Divdce by zero
		   System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero error"+ e);
			System.out.println("GoodBye");
		}
		
		finally {
			System.out.println("This block is executed whether or not exception occurs");
		}
		

	}

}
