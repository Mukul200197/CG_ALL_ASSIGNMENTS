import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap=new ClassPathXmlApplicationContext("SpringQ9.xml");
		
		((AbstractApplicationContext) ap).close();
		
		
	}

}
