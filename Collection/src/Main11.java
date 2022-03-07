import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class Main11 {

	public static void main(String ar[])
	{
		List < String > one = new ArrayList < String > ();
	     one.add("abc");
	List < String > two = new Vector < String > ();
	     two.add("abc");
	     if(one == two) {
	          System.out.println("A");
	       } 
	     else if(one.equals(two)) {
	          System.out.println("B");
	        } 
	     else {
	         System.out.println("C");

	}
	
	}
}

