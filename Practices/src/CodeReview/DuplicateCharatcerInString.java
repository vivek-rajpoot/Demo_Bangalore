package CodeReview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharatcerInString {
	public static void main(String[] args) {
		findduplicatecharacter("programming");
	}
	
	public static void findduplicatecharacter(String word) {
		char[] chr=word.toCharArray();
		Map<Character, Integer> charmap=new HashMap<Character, Integer>();
		for (char c : chr) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}else {
				charmap.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entryset=charmap.entrySet();
		System.out.println("Duplicate charatcer in string "+word);
		for (Entry<Character, Integer> entry : entryset) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate character "+entry.getKey()+" is "+entry.getValue());
			}
			
		}
		
		
	}
	
	

}
