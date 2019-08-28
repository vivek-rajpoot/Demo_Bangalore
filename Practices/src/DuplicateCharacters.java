import java.util.Scanner;

public class DuplicateCharacters {
         
          public static void main(String[] args) {
        	  //duplicate charater in the string
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter the string for reverse::");
        	  String str=sc.next();
        	  //System.out.println(str);
        	  char[] chars=str.toCharArray();
        	  int len=str.length();
        	  
        	  for(int i=0;i<len;i++) {
        		  for(int j=i+1;j<len;j++) {
        			  int count=1;
        			  if(chars[i]==chars[j]) {
        				  System.out.println(chars[j]);
        				  count++;
        				  System.out.println(count);
        				  
        			  }
        		  }
        	  }//System.out.println(count);
          }
 }