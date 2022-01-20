import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda5 
{
	public static void main(String a[])
	{
		
		List<String> s = Arrays.asList("Rutu", "Mukul", "Virat", "Mahi", "Rohit"); 
		Consumer<String>consumerString=s1->System.out.println(s1);
		s.stream()
		       .map(s1 ->s1.substring(0, 1)) 
		       .forEach(s1 ->System.out.println(s1)); 
	}

}
