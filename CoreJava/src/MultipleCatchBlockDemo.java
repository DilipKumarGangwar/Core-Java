
public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		int i=15, j=0;
		
		try{
		   int arr[]= {1,2,3,4};
		   arr[5]=20;
//		   int b[]=null;            //uncomment these 2 lines  and check what happens
//		   b[0]=23;
		   int k=i/j;    //Divdce by zero
		   System.out.println("Hello");
		}
		
		//Catch should catch specific exception  to general Exception
		catch(ArithmeticException e) {
			System.out.println("Divide by zero error"+ e);
			System.out.println("GoodBye");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound Exception"+ e);			
		}
		catch(Exception e) {             //this catch block cannot come above or in between above 2 catch block
			System.out.println("All exceptions are caught here . Nobody can escape from here"+ e);	
		}
		
		
		finally {
			System.out.println("This final block is executed whether or not exception occurs");
		}
		

	}

}
