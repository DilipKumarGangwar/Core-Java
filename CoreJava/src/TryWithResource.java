import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number");
		//Try with resource
		//This way we can close the resource without catch and finally 
		try ( BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))){   
			int i=Integer.parseInt(bufferedReader.readLine());   //read a string ( in form of number) and convert to its decimal form 
			 System.out.println("USer entered="+i);
		}
	}
	
}
