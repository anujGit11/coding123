package String;

public class NoOfWordsandAlpaINaString {

	
	
	public static void main(String[] args) {
		
		String name = "Mithu Tota";
		String[] s = name.split(" ");
		System.out.println(s.length);

		for (String s1 : s) {
			System.out.println(s1);
		}


		//count Number of characters including space
		String name1 = "Mithu Tota";
		String[] split = name.split("");
		System.out.println(split.length);


		//count Number of words
		String s2 = "Mithu Tota";
		String[] s1 = s2.split(" ");
		System.out.println(s1.length);

		//Number odf alphabets after removing space
		String strr = "VIRAT KOHLI";
		String withoutSpaces = strr.replace(" ", "");
		System.out.println(withoutSpaces); //VIRATKOHLI
		System.out.println(withoutSpaces.length());
	}}
