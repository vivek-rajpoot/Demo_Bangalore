package vivek;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployees  {
	public static void main(String[] args) {
		ArrayList<Employees> al=new ArrayList<>();
		al.add(new Employees(101, "Vivek", "java"));
		al.add(new Employees(102, "Ruhi", "SAP"));
		al.add(new Employees(103, "Prashant", "Sharepoint"));
		al.add(new Employees(104, "Neha", "Testing"));
		Collections.sort(al, new ShortByName());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
	}

	
}
