import java.util.ArrayList;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
        al.add("Bottle");
        al.add("water");
        al.add("liquid");
        al.add("oil");
      System.out.println(al);
      System.out.println(al.get(1));
      System.out.println(al.contains("oil"));
        al.add(2,"salt");
      System.out.println(al);
      System.out.println(al.isEmpty());
      System.out.println(al.indexOf("oil"));
      System.out.println(al.size());

	}

}
