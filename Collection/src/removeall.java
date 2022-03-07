import java.util.ArrayList;

public class removeall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list2.add(300);
        list2.add(400);
        System.out.println(list1);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println(list1);

	}

}
