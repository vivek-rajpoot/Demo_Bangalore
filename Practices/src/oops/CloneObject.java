package oops;

public class CloneObject implements Cloneable{
public static void main(String[] args) throws CloneNotSupportedException {
	CloneObject c=new CloneObject();
	Object ob=c.clone();
}

}
