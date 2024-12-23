package String;

import java.util.Iterator;

public class A {
	
	
	public static void main(String[] args) {
		String name = "ANUJ VISHWA KARMA";
		
//		for (int i = name.length()-1; i>=0; i--) {
//			
//			System.out.print(name.charAt(i));
//		}
		
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println(name.charAt(i));
//		}
		
		String[] s = name.split(" "); // words
		
		
		//String[] s = name.split(""); // alphabets+space
		
		System.out.println(s.length);
		
		
		
		
	}

}
