import java.util.Scanner;

public class CheckVowelConsonantDigitSpace {
	public static void main(String[] args) {
		System.out.println("Enter the string to find count for vowel,consonan,digit and space from string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String lower=str.toLowerCase();
		char[] ch=lower.toCharArray();
		int vowel=0,conso=0,digit=0,space=0;
		for (char c : ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
				//System.out.println("vowel letter is"+c);
			}else if(c>='a' && c<='z') {
				conso++;
				//System.out.println("Conso letter is"+c);
			}else if(c>='0' && c<='9') {
				digit++;
				//System.out.println("digit letter is"+c);
			}else if(c==' ')
				space++;
			//System.out.println("Space letter is"+c);
		}
		System.out.println("vowel letter count"+vowel);
		System.out.println("conso letter count"+conso);
		System.out.println("digit letter count"+digit);
		System.out.println("space letter count"+space);
		
	}
	
}
