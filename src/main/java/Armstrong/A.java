package Armstrong;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		
//		int a,b,r,s=0;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//
//		b=a;
//
//		while(a>0) {
//
//			r = a%10;
//			s = (r*r*r)+s;
//			a = a/10;
//		}
//		if(b == s) {
//			System.out.println("Yes Armstrong Number");
//		}else {
//			System.out.println("NOOOO");
//		}
//


		int a,b,r,s=0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();

		b=a;

		while(a>0){

			r = a%10;
			s = (r*r*r)+s;
			a = a/10;


		}
		if(b==s){
			System.out.println("Yes it is Armstrong");
		}else{
			System.out.println(
					"noooo"
			);
		}






	}
}
