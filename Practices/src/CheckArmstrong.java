import java.util.Scanner;
//Armstrong number is a number that is equal to the sum of cubes of its digits. 
//For example 0, 1, 153, 370, 371 and 407 
public class CheckArmstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rem,armstrong=0;
		int num1=num;
		while(num!=0) {
			rem=num%10;
			armstrong=armstrong+rem*rem*rem;
			num=num/10;
		}
		if(num1==armstrong) {
			System.out.println(num1+" is armstrong number");
		}else {
			System.out.println(num1+" is not armstrong number");
		}
	}

}
