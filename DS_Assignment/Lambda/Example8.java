import java.util.ArrayList;
import java.util.List;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<Integer>(){{
            add(11);
            add(55);
            add(37);
            add(95);
            add(99);
        }};
        
        Thread mylambda = new Thread(()->System.out.println(num));
        mylambda.run();
	}
}