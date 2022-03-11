import java.util.NavigableMap;
import java.util.TreeMap;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> b1 = new TreeMap<Integer,String>();  
        b1.put(3,"Tamilnadu");  
        b1.put(2,"Gujarat");  
        b1.put(4,"Orissa");
        b1.put(1,"Kerala");
        System.out.println(b1);
        System.out.println(b1.pollLastEntry());
        System.out.println(b1);

	}

}
