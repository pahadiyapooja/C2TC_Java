import java.util.ArrayList;
import java.util.List;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> val = new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		val.add(34);
		val.add(45);
		for(Integer e : val)
		{
			System.out.println(e);
		}
		System.out.println("ArrayList:"+val);
	}

}
