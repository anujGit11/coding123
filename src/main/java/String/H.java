package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class H {
	
	public static void main(String[] args) {
		String name = "AABCDBECF";
		
		Map<Character,Integer> map = new LinkedHashMap();

		//Occurrence of each character...
		//to get the character from string
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i); // getting the character from string based on index no.
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1); // if key already exists then put it in a map by
				                            // by incrementing the value by 1
			}else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		//To find the first character of non repeating...
		for(Entry<Character,Integer> entrySet : map.entrySet()) { //Entry interface works w K-V pairs
			
			                                 //map.entrySet() returns a Set of entry
			
			if(entrySet.getValue() == 1) { //retrieves the key
				
				System.out.println(entrySet.getKey()); ////retrieves the value
				break;
			}
		}
		
	}

}
