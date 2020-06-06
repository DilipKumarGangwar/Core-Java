//Sort in ascending order  the List by last digit of each elements i.e 231 ,5007, 128 
//We use our Custom comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer>  c = new ArrayList<Integer>();  //Arraylist Class Implements List interface(directly)
		List<Integer>  c2 = new ArrayList<Integer>();
		c.add(128);
		c.add(231);
		c.add(5007);
		
		//All 3 ways are ok (Lamda Expression)
		//1st way
//		Comparator<Integer> comparatorObject = new Comparator<Integer>()    
//										{
//											public int compare(Integer a, Integer b)
//											{
//												return a%10 > b%10 ? 1 : -1;
//											}
//										};
		//2nd way
		Comparator<Integer> comparatorObject = (Integer a, Integer b)->              //or (a,b)->    
										{
											
												return a%10 > b%10 ? 1 : -1;
											
										};					
										
		//3rd way
		// Collections.sort(c,(a,b)->a%10 > b%10 ? 1 : -1);   //Directly in sort()
		
		
		Collections.sort(c,comparatorObject);           //comparatorObject is object of Comparator Interface(via Lamda expression)
		System.out.println("List in Ascending order");
		for (int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i)+ " ");
		}

	}
	

}
