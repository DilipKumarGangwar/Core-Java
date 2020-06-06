// Add key, values in map and print that data

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		
		//key=Name, value= country
		map.put("Dilip","USA");
		map.put("Ram","India");
		map.put("Deepa","Canada");
		map.put("Sameer","Italy");
		
		//1st way to display data
		System.out.println("1st way:");
		System.out.println(map);
		
	
		//2nd way to display data
		System.out.println("2nd way:");
		Set<String > keys = map.keySet();  //extract all keys from map
	    for (String k : keys) {        //iterate over keys and print values
		   System.out.print(map.get(k) + " ");   
	    }
	    System.out.println();
	    
	    
		

	}

}
