package InterviewCoding;
import java.util.*; 
   
public class RotateDemo 
{ 
    public static void main(String[] args) 
    { 
        // Let us create a list of strings 
        List<String>  mylist = new ArrayList<String>(); 
        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("geeksforgeeks"); 
   
        System.out.println("Original List : " + mylist); 
   
        // Here we are using rotate() method 
        // to rotate the element by distance 2 
        Collections.rotate(mylist, 2); 
   
        System.out.println("Rotated List: " + mylist); 
    } 
} 