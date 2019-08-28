package InterviewCoding;

import java.util.Scanner;

public class TocheckPalindromNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to check palindrom");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0,num1=num,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}if(num1==rev) {
			System.out.println(num1+" is palindrome number");
		}else {
			System.out.println(num1+" is not palindrome number");
		}
		
	}

}
