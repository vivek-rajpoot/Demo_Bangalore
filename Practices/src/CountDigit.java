import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String with digit::");
		String str = sc.nextLine();
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		System.out.println("Digit count is " + count);
	}
}
