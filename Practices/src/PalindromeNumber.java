import java.util.Scanner;

//reverse number is equal to actual number then number is palindrome
public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int num1=num;
	int rem,rev=0;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(num1==rev) {
		System.out.println(num1+" is palindrome number");
	}else {
		System.out.println(num1+" is not palindrome number");
	}
}
}
