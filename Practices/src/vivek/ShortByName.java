package vivek;

import java.util.Comparator;

public class ShortByName implements Comparator<Employees>  {

	@Override
	public int compare(Employees e1, Employees e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}

}
