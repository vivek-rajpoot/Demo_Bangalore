import java.util.ArrayList;
import java.util.Collections;

class TestEmployees {
	public static void main(String[] args) {
		ArrayList<Employees> al = new ArrayList<Employees>();
		al.add(new Employees(101, "vivek", "java"));
		al.add(new Employees(102, "Ruhi", "SAP"));
		al.add(new Employees(103, "Neha", "Automation"));
		al.add(new Employees(104, "Shanti", "Spring"));
		al.add(new Employees(105, "Prashant", "sharepoint"));
		Collections.sort(al, new ShortByName());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}
}
