import java.util.*;
public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   LinkedList<String> list = new LinkedList<String>();
	         list.add("River");
	        list.add("sea");
	        list.add("salt");
	        list.add("liquid");
	       System.out.println(list);     
	       String s = "liquid";
	        boolean c = list.contains(s);
	        if(c){ 
	                 System.out.println(list.indexOf(s));     }

	}

}
