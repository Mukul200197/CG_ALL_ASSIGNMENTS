import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Spel1 {  
	public static void main(String[] args) {  
		
		 
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello Abhi'.bytes.length");  
int length = (Integer) exp.getValue();  
System.out.println(length);  
		 
}  
}  
