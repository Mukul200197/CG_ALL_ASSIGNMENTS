import java.util.*;
public class arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(a / b); 
        }
        catch (ArithmeticException e) {

            System.out.println("Divided by zero");
            System.out.println(e);
        }
		
	}

}
