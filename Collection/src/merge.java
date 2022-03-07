import java.util.*;
public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		LinkedList<String> ll2=new LinkedList   <String>();
		ll2.add("Sonoo");
        ll2.add("Hanumat");
		ll.addAll(ll2);
		System.out.println("After invoking addAll method: "+ll);			 

	}

}
