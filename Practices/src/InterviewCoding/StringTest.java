package InterviewCoding;
public class StringTest {

	  public static void main(String[] args) {
	      String s = "yo-dude: like, ... []{}this is a string";
	      s = s.replaceAll("[^a-zA-Z0-9]", " ");
	      System.out.println(s);
	  }

	}
