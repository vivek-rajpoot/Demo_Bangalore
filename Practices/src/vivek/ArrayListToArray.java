package vivek;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("spring");
		al.add("hibernate");
		al.add("sql");
		System.out.println(al);
		Object[] array=al.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}

}
