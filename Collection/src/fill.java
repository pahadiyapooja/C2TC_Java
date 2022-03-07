import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       List<String> arrlist = new ArrayList<>();  
	        arrlist.add("java");  
	        arrlist.add("Technical");  
	        arrlist.add("webinar");  
	       System.out.println("List elements before Replacements: "+arrlist);  
	        Collections.fill(arrlist,"technology");  
	       System.out.println("List elements after Replacements: "+arrlist);
	}

}
