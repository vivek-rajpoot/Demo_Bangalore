
public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		int[] arr= {10,20,20,30,40,40,50,50};
		int len=arr.length;
		RemovedDuplicateInArray(arr,len);
	}

	private static void RemovedDuplicateInArray(int[] arr, int len) {
		  int[] temp=new int[len];
		  int j=0;
		  for(int i=0;i<len-1;i++) {
			  if(arr[i]!=arr[i+1]) {
				  temp[j++]=arr[i];
			  }
		  }temp[j++]=arr[len-1];
		  for (int i = 0; i < j; i++) {
			System.out.println(temp[i]+" ");
		}
	}

}
