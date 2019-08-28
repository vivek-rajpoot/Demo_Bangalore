package com;

import java.util.Scanner;
//Here we are finding count for vowel,consonant,digit,space etc
public class CountSomething {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphanumeric String ::");
		String str=sc.nextLine();
		//System.out.println(str);
		String lower=str.toLowerCase();
		int len=lower.length();
		int vowel=0,consonant=0,digit=0,space=0;
		for(int i=0;i<len;i++) {
			char ch=lower.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else if(ch >='a' && ch<='z') {
				consonant++;
			}else if(ch >='0' && ch<='9') {
				digit++;
			}else if(ch==' ') {
				space++;
			}
		}
		System.out.println("vowel count is "+vowel);
		System.out.println("Consonant count is "+consonant);
		System.out.println("Digit count is "+digit);
		System.out.println("Space count is "+space);
		
	}

}
