import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(); 
        list.add("practice"); 
        list.add("code"); 
        list.add("every");
        list.add("day"); 
     System.out.println("Original List : " + list); 
     Collections.rotate(list, 2); 
     System.out.println("Rotated List: " + list); 

	}

}
