import java.util.*;
public class merge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
		ll.add("Vijay");
 LinkedList<String> ll3=new LinkedList<String>();
  ll3.add("John");
  ll3.add("Rahul");
  ll.addAll(1,ll3);
         System.out.println("After invoking addAll method: "+ll);

	}

}
