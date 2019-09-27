package CodeReview;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to check prime number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=false;
		if(num==0 || num==1) {
			System.out.println("Number is not prime number ");
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}
		
	}

}
