package String;

public class ForwardAndReverseTHroughFORloop {
	
	public static void main(String[] args) {
		
		String a = "Anuj Vishwakarma";

		// Forward traversal
//		for (int i = 0; i < a.length(); i++) {
//			System.out.print(a.charAt(i) + " ");
//		}

		for(int i =0; i<a.length(); i++){

			System.out.print(a.charAt(i));
		}

		System.out.println(); // Line break for better output readability

		// Reverse traversal
		for (int j = a.length() - 1; j >= 0; j--) {
			System.out.print(a.charAt(j));
		}
	}

}
