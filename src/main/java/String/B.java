package String;

public class B {
//
//	public static void main(String[] args) {
//		
//		String x = "   Sony Tv   ";
//		
//		String[] result = x.trim().split(" "); // to overcome space
//		System.out.println(result.length);
//	}
	
	
	public static void main(String[] args) {
		
		String name = "Mithu Tota";
		String[] s = name.split(" ");
		System.out.println(s.length);
		
		for (String s1 : s) {
			System.out.println(s1);
		}
	}
}
