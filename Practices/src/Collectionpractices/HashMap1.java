package Collectionpractices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hsmp=new HashMap<>();
		hsmp.put("one", 1);
		hsmp.put("two", 2);
		hsmp.put("three", 3);
		hsmp.put("four", 4);
		hsmp.put("five", 5);
		Set<Entry<String,Integer>> enrty=hsmp.entrySet();
		for (Entry<String, Integer> entry : enrty) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}

}
