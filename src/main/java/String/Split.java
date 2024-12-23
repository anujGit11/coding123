package String;

import java.util.Iterator;

public class Split {
	
	
	public static void main(String[] args) {

		String name = "Java is fun";

		String[] split = name.split(" ");

		for (String word : split){
			System.out.println(word);
		}
//
//
//
		String strr = "Apple,Banana,Cherry";
		String[] split2 = strr.split(",");
		for (String ss : split2){
			System.out.println(ss);
		}
//
		String str = "one1two2three3";
		String[] split3 = str.split("\\d");

		for (String s3: split3){

			System.out.println(s3);

		}



	}
}
