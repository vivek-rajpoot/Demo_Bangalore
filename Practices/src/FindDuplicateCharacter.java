import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacter {
	
	public static void main(String[] args) {
		printDuplicateCharatacter("programming");
		printDuplicateCharatacter("combination");
		printDuplicateCharatacter("vivek kumar");
	}
	private static void printDuplicateCharatacter(String str) {
		Map<Character,Integer> charMap=new HashMap<>();
		char[] ch=str.toCharArray();
		for (char chr : ch) {
			if(charMap.containsKey(chr)) {
				charMap.put(chr, charMap.get(chr)+1);
			}else {
				charMap.put(chr, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entryset=charMap.entrySet();
		System.out.println("List of duplicate character is string "+str);
		for (Map.Entry<Character, Integer> entry : entryset) {
			if(entry.getValue()>1) {
				System.out.println("..........."+entry.getKey()+"    "+entry.getValue());
			}
		}
	}

}
