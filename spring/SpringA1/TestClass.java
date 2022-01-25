import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

private static ApplicationContext context;
	
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("CustomerAddress.xml");
	
		
		Customer cust= (Customer) context.getBean("obj");
		cust.show();
	
	}
	
}