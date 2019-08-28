package pract09April;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "vivek");
		map.put(2, "Singh");
		map.put(3, "rajpoot");
		
		Set<Map.Entry<Integer, String>> val=map.entrySet();
		for (Map.Entry<Integer, String> entry : val) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}
