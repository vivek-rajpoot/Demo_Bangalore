package oops;

import java.util.Scanner;

public class Rectangle extends Shape {
	//int a=10,b=20,area=0;
	int area;
	@Override
	public void show() {
		System.out.println(area);
		
	}
	@Override
	public void calculateArea(int a,int b) {
		area=a*b;
		show();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		System.out.println("Enter the value");
		int b=sc.nextInt();
		Rectangle r=new Rectangle();
		r.calculateArea(a, b);
		
	}

	

}
