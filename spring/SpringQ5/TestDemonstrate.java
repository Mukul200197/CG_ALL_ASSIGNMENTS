import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemonstrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("Spring5Eg.xml");
		
		Demonstrate demo=(Demonstrate) con.getBean("msg1");
		System.out.println(demo.getMsgID()+" "+demo.getMsg() );
		
	}
}
