import java.util.*;
import java.util.function.UnaryOperator;

class replace implements UnaryOperator<String>
{
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<>();
		l1.add("javascript");
		l1.add("java");
		l1.add("typescript");
		l1.add("html");
		l1.add("css");
		
		l1.replaceAll(new replace());
		System.out.println(l1);
		
	}

}
