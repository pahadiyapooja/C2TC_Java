import java.util.SortedMap;
import java.util.TreeMap;

public class FirstEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer,String> httpcode=new TreeMap<Integer,String>();  
  		httpcode.put(103,"May");  
  		httpcode.put(100,"the");  
  		httpcode.put(102,"Fourth");
  		httpcode.put(200,"be with");
  		httpcode.put(205,"you");
  		System.out.println(httpcode);
  		System.out.println(httpcode.firstKey());
  		System.out.println(httpcode.lastKey());

	}

}
