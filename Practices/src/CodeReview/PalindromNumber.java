package CodeReview;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to check palindrom ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int rev=0,rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}if(num1==num) {
			System.out.println("Enter number is "+num1+" palindrom");
		}else {
			System.out.println("Enter number is not "+num1+" palindrom");
		}
	}

}
