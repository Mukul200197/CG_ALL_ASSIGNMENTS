import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)  
  
@interface Test
{  
	String str();  
}  
  
class Demo
{  
	@Test(str="TEST ANNOTATION")  
	public void testCase1(){}  
}  
  
//Accessing annotation  @Test
class TestAnnotation
{  
	public static void main(String args[])throws Exception
	{  
	  
		Demo h=new Demo();  
		Method m=h.getClass().getMethod("testCase1");  
	  
		Test ts=m.getAnnotation(Test.class);  
		System.out.println(ts.str());  
	}
}

