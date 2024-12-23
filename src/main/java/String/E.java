package String;



public class E { //One substring as it is 
	             // Second substring reverse...
	
	public static void main(String[] args) {
		
		String name = "VIRAT KOHLI";
		
		String substring1 = name.substring(0, 5);
		String substring2 = name.substring(6);
		
		System.out.print(substring1+ " ");
		
		for (int i = substring2.length()-1; i>=0; i--) {
			
			System.out.print(substring2.charAt(i));
		}
		
		
	}

}
