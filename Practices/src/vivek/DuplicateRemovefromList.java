package vivek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemovefromList {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("Spring");
		al.add("hibernate");
		al.add("javascript");
		al.add("jquery");
		al.add("java");
		al.add("Spring");
		System.out.println(al);
		HashSet<String> set=new HashSet<>(al);
		System.out.println(set);
		ArrayList<String> al1=new ArrayList<>(set);
		System.out.println(al1);
	}

}
