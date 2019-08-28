package com;

public class Student {
	int id;
	String name;
	String technology;
	public Student(int id, String name, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}
	
	

}
