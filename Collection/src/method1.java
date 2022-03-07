import java.util.ArrayList;
import java.util.List;


public class method1 {
	public static void main(String[] args) {
		List<Integer> val = new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		java.util.Iterator<Integer> z =  val.iterator();
		while( z.hasNext())
		{
			System.out.println(z.next());
		}
		System.out.println("ArrayList:"+val);
		
	}

}
