
//Condition 1

abstract class Ex1{
	public void dis(){
		System.out.println("I am from Abstract Class but not from Abstract Method");
	}
	abstract public void dis1();
}
class Sample extends Ex1{
	public void dis1() {
		System.out.println("Abstract Method");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.dis1();
	}

}




//Abstract class cannot be private
/*abstract class con2{
	private static abstract void dis();
}

AbstractClassExample.java:2: error: illegal combination of modifiers: abstract and private
private static abstract void display();
                           ^
1 error
*/



//Abstract Class cannot be Final
/*abstract final class Department
{
    String collegeName = "SUK";
    public void collegeName()
    {
        System.out.println("Name of college = "+ collegeName);
    }
    //abstract methods
    public abstract void deptName();
    public abstract void noOfTeachers();
    
}



class MainClass extends Department
{
    public static void main(String arg[])
    {
        MainClass obj = new MainClass();
    }

    @Override
    public void deptName() {
        // TODO Auto-generated method stub
        
    }

}*/
//Output: This will show exception at compilation time.



