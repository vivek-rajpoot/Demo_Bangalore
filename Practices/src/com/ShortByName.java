package com;

import java.util.Comparator;

public class ShortByName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}
