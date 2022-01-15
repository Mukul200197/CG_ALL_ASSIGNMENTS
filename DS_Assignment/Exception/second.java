
import java.util.Scanner;
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Numbers: ");
		int a =sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(a / b); 
        }
        catch (Exception e) {

            System.out.println("UnsupportedOperationException");
            //System.out.println(e);
        }
		
	}

}
