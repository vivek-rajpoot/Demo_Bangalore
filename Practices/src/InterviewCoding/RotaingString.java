package InterviewCoding;

public class RotaingString {
	
	public static void main(String[] args) {
		String Str1="ABCD";String Str2="CDAB";
		if(isRotating(Str1,Str2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}

	private static boolean isRotating(String str1, String str2) {
		// TODO Auto-generated method stub
		return ((str1.length()==str2.length()) && ((str1+str1).contains(str2)));
	}

	

}
