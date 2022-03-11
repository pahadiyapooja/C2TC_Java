import java.util.Map;
import java.util.HashMap;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();  
  		map.put(96,"Tanay");  
  		map.put(80,"Aditya");  
  		map.put(100,"Neha");  
  		for(Map.Entry m:map.entrySet())
  		{  
   			System.out.println(m.getKey()+" "+m.getValue());  
  		}  

	}

}
