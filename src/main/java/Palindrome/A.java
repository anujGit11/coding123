package Palindrome;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		int a,b,r,s=0;
		System.out.println("Enter any number: ");
		Scanner scan = new Scanner(System.in);
		
		a= scan.nextInt();
		b=a;
		
		while(a>0) {
			
			r= a%10;
			s= (s*10)+r;
			a= a/10;
			
			
			
		}
		if(b==s) {
			System.out.println("Palindrome Number...");
			
		}else {
			System.out.println("No it is not a Palindrome Number");
		}
		
		
		
		
		
		
		
	}

}
