//checked exception- Exception caught by compiler
import java.io.BufferedReader;

import java.io.InputStreamReader;



public class CheckedExceptionDemo {

	public static void main(String[] args) throws Exception {   //this throws is used as even finally block may raise exception in closing the resource
		
		BufferedReader bufferedReader=null;     //bufferedReader is a resource
		System.out.println("Enter a number");
		try {
		 bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		 //Raises checked Exception if string is entered
		 int i=Integer.parseInt(bufferedReader.readLine());   //read a string ( in form of number) and convert to its decimal form 
		 System.out.println("USer entered="+i);
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught!!"+e);
		}
		finally {
			bufferedReader.close();
			System.out.println("Resource is closed");
		}
		 
		 
		

	}

}
