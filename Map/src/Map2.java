import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('a',"Anil");
		map.put('b',"Babu");
		map.put('c',"Charan");
		map.put('d',"Dharani"); 		
		map.remove("Babu");         
         System.out.println(map);

	}

}
