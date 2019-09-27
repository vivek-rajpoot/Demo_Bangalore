package InterviewCoding;

public class removedSpacewithSpecialcharacter{
	public static void main(String[] args) {
		String str="  Hi vivek how are you";
		str=str.trim();
		System.out.println(str);
		String s1=str.replaceAll("\\s", "%20");
		System.out.println(s1);
		
	}
	
}
