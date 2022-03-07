import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> val = new ArrayList<>();
		val.add(100);
		val.add(200);
		List<Integer> val1 = new ArrayList<>();
		val1.add(500);
		val1.add(800);
		val1.addAll(val);
		
		System.out.println("ArrayList:"+val);
	}
}
