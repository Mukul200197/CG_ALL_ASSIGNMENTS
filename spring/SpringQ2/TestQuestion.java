import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context=new ClassPathXmlApplicationContext("QuestionXML.xml");
		
		Question q=(Question) context.getBean("que");
		q.showAnswer();
		
		
	}

}
