package com;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Vivek", "Java"));
		al.add(new Student(102, "Ruhi", "SAP"));
		al.add(new Student(103, "Neha", "Automation"));
		al.add(new Student(104, "Pk", "sharepoint"));
		al.add(new Student(105, "Shanti", "Spring"));
		Collections.sort(al, new ShortByName());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		Collections.sort(al, new ShortByTechnology());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
