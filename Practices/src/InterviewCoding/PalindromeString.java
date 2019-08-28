package InterviewCoding;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String rev="";
	for(int i=str.length()-1;i>=0;i++) {
		rev=rev+str.charAt(i);
	}if(str.contains(rev)) {
		System.out.println();
	}
}
}
