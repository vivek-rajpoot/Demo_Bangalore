package InterviewCoding;

public class RemoveDuplicateInArrayExample {
	public static void removeDuplicateElement(int arr[], int n) {
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i <j; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		removeDuplicateElement(arr, length);
	}
}
