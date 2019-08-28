import java.util.Scanner;

public class FibonaciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for fibo series:");
	int num=sc.nextInt();
	int a=0,b=0,c=1;
	System.out.println(a);
	for (int i = 0; i <=num; i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(c+"");
	}
}
}
