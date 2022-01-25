import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("Spring10Q.xml");
		
		
		ContextAware CA= (ContextAware) con.getBean("ca");
		CA.draw();
		
	}

}
