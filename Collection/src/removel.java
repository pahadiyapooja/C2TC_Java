import java.util.*;
public class removel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Harsh");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: "+ll);

	}

}
