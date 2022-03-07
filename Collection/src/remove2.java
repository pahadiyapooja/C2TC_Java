import java.util.*;
public class remove2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Harsh");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
   ll.removeFirst();
		System.out.println("After invoking removeFirst() method: "+ll);
		      ll.removeLast();
System.out.println("After invoking removeLast() method: "+ll);

	}

}
