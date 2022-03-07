import java.util.*;
public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Harsh");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
		        ll.remove("Vijay");
		System.out.println("After invoking remove(object) method: "+ll);
	}

}
