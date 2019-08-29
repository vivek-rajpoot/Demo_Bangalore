import java.util.HashSet;
import java.util.Set;

public class RemovedDuplicatewordInString{
	public static void main(String[] args) {
		String str="This sentence contains two words, one and two";
		Set<String> duplicate=RemoveDuplicate(str);
		System.out.println("Before removing duplicate..."+str);
		System.out.println("After removed duplicate..."+duplicate);
	}

	private static Set<String> RemoveDuplicate(String str) {
		Set<String> str1=new HashSet<String>();
		String[] arr=str.split("\\s+");
		for (String string : arr) {
			str1.add(string);
		}
		
		return str1;
	}
	
}