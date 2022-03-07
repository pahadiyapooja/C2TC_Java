import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> val = new ArrayList<>();
		val.add("pen");
		val.add("pencil");
		val.add("eraser");
		System.out.println("List :"+val);
		boolean res= val.contains("pencil");
		System.out.println("Is pencil present in the list :"+res);
	}

}
