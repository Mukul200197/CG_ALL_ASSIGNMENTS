import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "A quick brown fox jumps over the lazy dog";
		String words[] = st.split(" ");
		
		List<String> list = new ArrayList<String>();
		for(String text:words) {
	         list.add(text);
		}
		
		System.out.println(list);
		
		//java11 
		String[] array = list.toArray(String[]::new);
		System.out.println(Arrays.toString(array));
	}

}
