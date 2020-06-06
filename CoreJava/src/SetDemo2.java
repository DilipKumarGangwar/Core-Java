/* Insert elements in Treeset and print them
 * Treeset  preserve order of insertion, and do not allow duplicates 
 * Gives elemenst in sorted order
 * 
 */
import java.util.TreeSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		
		Set<Integer> s1=new TreeSet<Integer>();   
		
		s1.add(23);
		s1.add(53);
		s1.add(233);
		s1.add(81);
		
		System.out.println("In Ascending order");
		for (Integer i : s1) {
			System.out.println(i + " ");
		}		
		//for descending order
        TreeSet<Integer> s2=new TreeSet<Integer>();   
		
		s2.add(23);
		s2.add(53);
		s2.add(233);
		s2.add(81);
		
		TreeSet<Integer> revIntegers =  (TreeSet<Integer>)s2.descendingSet();   // s2.descendingSet()  returns Navigable<set>, so typecasting is needed 
		System.out.println("In Ascending order");
		for (Integer i : s2) {
			System.out.println(i + " ");
		}
		System.out.println("In descending order");
		 for (Integer i : revIntegers) {
			 System.out.println(i + " ");
		}
		
		
		
	
		
	}
}
