package vivek;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
public static void main(String[] args) {
	String array[]= new String[] {"java","spring","hibernate","jsp"};
	for (String string : array) {
		System.out.println(string);
	}
	ArrayList<String> al=new ArrayList<>();
	al.addAll(Arrays.asList(array));
	System.out.println(al);
}
}
