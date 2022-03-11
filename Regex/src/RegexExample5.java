import java.util.regex.Pattern;

public class RegexExample5 {
	public static void main(String ar[])
	{
	System.out.println("+ quantifier......");
	System.out.println(Pattern.matches("[amn]+", "a"));
	System.out.println(Pattern.matches("[amn]+", "aaa"));
	System.out.println(Pattern.matches("[amn]+", "aammmnn"));
	System.out.println(Pattern.matches("[amn]+", "aazzta"));
	System.out.println(Pattern.matches("[amn]+", "am"));
	
	System.out.println("* quantifier......");
	System.out.println(Pattern.matches("[amn]*", "ammmna"));
	
	}
}
