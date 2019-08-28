package InterviewCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemovedDuplicatewithCollection {
	public static void main(String[] args) {
		List<String> lt=new ArrayList<String>();
		lt.add("vivek");
		lt.add("Sagar");
		lt.add("vivek");
		lt.add("sagar");
		lt.add("kumar");
		lt.add("Singh");
		System.out.println("Before removing duplicate..."+lt);
		HashSet<String> hst=new HashSet<>(lt);
		List<String> lt1=new ArrayList<>(hst);
		System.out.println("After the removing duplicate....."+lt1);
	}

}
