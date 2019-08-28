package sonal.neha;

public class TestClass  {
 public static void main(String[] args) {
	 int vowel=0,cons=0,digit=0,space=0;
	String str="This is vivek2902345";
	String lower=str.toLowerCase();
	int len=str.length();
	//System.out.println(len);
	for (int i = 0; i < len-1; i++) {
		char ch=lower.charAt(i);
		System.out.println(ch);
		if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u') {
			vowel++;
			//System.out.println(vowel);
		}else if(ch<'a' && ch>='z') {
			cons++;
			//System.out.println(cons);
		}else if(ch>=0 && ch<=9) {
			digit++;
			//System.out.println(digit);
		}else if(ch==' ') {
			space++;
			//System.out.println(space);
		}
		
	}
	System.out.println(vowel+":"+cons+":"+digit+":"+space);
	
}
	
}
