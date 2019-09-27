package CodeReview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFromString {
	public static void main(String[] args) {
		String str="This sentence contains two words,one and two";
		duplicateString(str);
	}

	private static void duplicateString(String str) {
		String[] str1=str.split(" ");
		//System.out.println(str1);
		Set<String> set=new HashSet<>();
		for (String string : str1) {
			set.add(string);
		}
		System.out.println(set+" ");
		
	}

}
