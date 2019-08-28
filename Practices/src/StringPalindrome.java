import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter the string for palindrome");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		if(str.contains(rev)) {
			System.out.println(rev+" is palindrome");
		}else {
			System.out.println(rev+"is not palindrome");
		}
	}

}
