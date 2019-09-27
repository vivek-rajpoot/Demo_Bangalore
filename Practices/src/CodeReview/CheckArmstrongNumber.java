package CodeReview;

import java.util.Scanner;

public class CheckArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to check armstrong ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int rem=0,armstrong=0;
		while(num>0) {
			rem=num%10;
			armstrong=armstrong+rem*rem*rem;
			num=num/10;
		}
		if(num1==armstrong) {
			System.out.println("Armstrong number is "+num1);
		}else {
			System.out.println("Armstrong number is not "+num1);
		}
	}

}
