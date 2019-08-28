package InterviewCoding;

import java.util.Scanner;

public class ToCheckArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to check armstrong ::");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int rem,arm=0;
		while(num!=0) {
			rem=num%10;
			arm=arm+rem*rem*rem;
			num=num/10;
		}if(num1==arm) {
			System.out.println(arm+"is armstrong");
		}else {
			System.out.println(arm+"is not armstrong");
		}
		
	}

}
