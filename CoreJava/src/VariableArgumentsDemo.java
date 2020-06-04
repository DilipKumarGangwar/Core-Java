
class Calculation{
	
	int add1(int a,int b, int c) {    //Simple way of accepting  Arguments
		return a+b+c;
		
	}
	
	int add2(int ... n) {     //Here we received all 7 arguments in form of array in "n" (Way of catching variable no of args)
		int sum=0;
		for (int i : n) {    //As we get args in form of array ,so accordingly do the  sum  
			sum=sum+i;
		}
		return sum;
		
	}
}

public class VariableArgumentsDemo {
	public static void main(String args[]) {
		
		Calculation c = new Calculation();
		System.out.println(c.add1(2, 3, 4));
		
		System.out.println(c.add2(1,2, 3, 4,5,6,7));  //passing many arguments
		
		
		
	}

}
