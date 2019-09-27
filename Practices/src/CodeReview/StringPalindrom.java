package CodeReview;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		System.out.println("Enter the string for palindrom");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		for (int i = str.length()-1; i>0; i--) {
			
			str1=str1+str.charAt(i);
		}
		if(str.contains(str1)) {
			System.out.println(str+" is palindrom string");
		}else {
			System.out.println(str+" is not palindrom string");
		}
	}

}
