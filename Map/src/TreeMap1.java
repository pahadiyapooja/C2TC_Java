import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SortedMap<String, String> t1  = new TreeMap<String,String>();
	        t1.put("Father", "Farmer");
	        t1.put("Mother", "Teacher");
	        t1.put("Son", "Engineer");
	        t1.put("Daughter", "Doctor");
	        t1.put("Cousin", "Manager");
	        for(SortedMap.Entry m:t1.entrySet())
	  	  {  
	   System.out.println(m.getKey()+" "+m.getValue());  

	}
	}
}
