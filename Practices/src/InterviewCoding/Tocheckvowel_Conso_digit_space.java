package InterviewCoding;

import java.util.Scanner;

public class Tocheckvowel_Conso_digit_space {
	public static void main(String[] args) {
		   System.out.println("Enter the respective string ");
	       Scanner sc=new Scanner(System.in);
	       String str=sc.nextLine();
	       int cVowel=0,cCons=0,Cdigit=0,Cspace=0;
	       String lower=str.toLowerCase();
	       char[] ch=str.toCharArray();
	       for (char c : ch) {
	    	   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
	    		   cVowel++;
	    	   }else if(c>='a' && c<='z') {
	    		   cCons++;
	    	   }else if(c>=0 && c=='9') {
	    		   Cdigit++;
	    	   }else if(c==' '){
	    		   Cspace++;
	    	   }
		}
	       System.out.println("Vowel count is "+cVowel);
	       System.out.println("Consonant count is "+cCons);
	       System.out.println("Digit count is "+Cdigit);
	       System.out.println("Space count is "+Cspace);
	}

}
