import java.util.regex.Pattern;

public class RegexExample7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("metacharaters D......");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4443"));
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m"));
		
		System.out.println("metacharaters D with quantifier *......");
		System.out.println(Pattern.matches("\\D*", "mak"));
	}
}
