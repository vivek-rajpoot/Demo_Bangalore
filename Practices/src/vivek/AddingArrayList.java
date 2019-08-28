package vivek;

import java.util.ArrayList;

public class AddingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(111);
		al.add(222);
		al.add(333);
		al.add(444);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(555);
		al1.add(666);
		al1.add(777);
		System.out.println(al1);
		al.addAll(1, al1);
		System.out.println(al);
	}

}
