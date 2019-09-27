package InterviewCoding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareElementInCollection {
	public static void main(String[] args) {
		String str[]= { "Penny", "nickel", "dime", "Quarter", "dollar" };
		Set set=new TreeSet();
		for(int i=0;i<str.length-1;i++) {
			set.add(i);
		}
		System.out.println(Collections.max(set));
		System.out.println("............");
	}

}
