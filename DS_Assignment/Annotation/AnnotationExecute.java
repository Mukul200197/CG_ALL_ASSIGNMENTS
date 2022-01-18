
import java.lang.reflect.Method;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Execute 
{

	int Sequence();

}

class Anno 
{
	@Execute(Sequence=2)
    public void method1() 
    {
        System.out.println("Method 1");
    }

    @Execute(Sequence=1)
    public void method2() 
    {
        System.out.println("Method 2");
    }
    
    @Execute(Sequence=3)
    public void method3() 
    {
        System.out.println("Method 3");
    }

}

public class AnnotationExecute {
    public static void main(String[] args) {

    	Anno ta = new Anno();
        Method[] methods = ta.getClass().getMethods();

        for (Method method : methods) {
            Execute exe = method.getAnnotation(Execute.class);
            if (exe != null) {
                try {
                    method.invoke(ta);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

