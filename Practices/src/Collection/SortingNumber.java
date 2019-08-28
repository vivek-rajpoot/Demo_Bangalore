package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNumber {
	public static void main(String[] args) {
		
		List<Integer> ls=Arrays.asList(1,5,8,2,3,4,9,0,8,7);
		System.out.println("Before Sorting "+ls);
		Collections.sort(ls);
		System.out.println("After Sorting "+ls);
		Collections.reverse(ls);
		System.out.println("After reverse "+ls);
		
	}

}
