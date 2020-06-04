/*
 * Foreach loop can be used when we do not want the indexes of the array/list, just want to have the elements
 * 
 */


public class EnhancedForLoop {
	public static void main(String args[]) {
		
		int [] arr= {10,20,30,40};          //Declare 1 D array 
		 
		int a[][]= {{1,2,3},                //Jagged Array( a type of 2d array) - size of each row is different
				    {4,5,6,7},
				    {8,9}};
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) 
//				System.out.print(a[i][j]+" ");
//		    System.out.println("\n");	
		
		System.out.println("Printing 1D Array");	
		for(int ele : arr)                              //Foreach loop
			System.out.print(ele + " ");
	    System.out.println();	
	    
	    System.out.println("\nPrinting Jagged Array");	
	    for (int [] row : a) {
	    	for (int  ele : row) 
              System.out.print(ele + " ");
            System.out.println();  
	    		
			
			
		}
		
		
		
		
	}

}
