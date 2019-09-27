package CodeReview;

import java.util.Scanner;

public class CheckVowelConsonantDigitSpace {
	public static void main(String[] args) {
		System.out.println("Enter the string to find vowel consonant digit space");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String lower=str.toLowerCase();
		char[] character=lower.toCharArray();
		int vowel=0,conso=0,digit=0,space=0;
		for (char c : character) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}else if(c>='a' && c<='z') {
				conso++;
			}else if(c>='0' && c<='9') {
				digit++;
			}else if(c==' ') {
				space++;
			}
		}
		System.out.println("vowel count "+vowel);
		System.out.println("Consonant count "+conso);
		System.out.println("Digit count "+digit);
		System.out.println("Space count "+space);
	}

}
