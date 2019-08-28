package com;

import java.util.Comparator;

public class ShortByTechnology implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.technology.compareTo(s2.technology);
	}

}
