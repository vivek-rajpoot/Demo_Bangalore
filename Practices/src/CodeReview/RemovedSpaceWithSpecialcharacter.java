package CodeReview;

public class RemovedSpaceWithSpecialcharacter {
	public static void main(String[] args) {
		String str=" This is vivek from patna ";
		String trim=str.trim();
		String str1=trim.replaceAll(" ", "%20");
		System.out.println(str1);
	}

}
