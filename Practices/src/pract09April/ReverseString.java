package pract09April;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String For Resverse");
		String str=sc.nextLine();
		/*String reverse="";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String "+reverse);*/
		String rev=new StringBuffer(str).reverse().toString();
		System.out.println(rev);
		
	}

}
