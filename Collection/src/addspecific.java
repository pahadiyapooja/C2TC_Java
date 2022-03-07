import java.util.LinkedList;

public class addspecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
       ll.add("Ajay");
        ll.add(1,"Gaurav");
       System.out.println("After invoking add(int index, E element) method: "+ll);
	}

}
