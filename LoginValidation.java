import java.util.*;
public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalAttempts=3;
		  while (totalAttempts != 0) {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter User Credentials");
			  String nm=sc.nextLine();
			  String pass=sc.nextLine();

		        if (nm.equals("Admin") && pass.equals("123")) {

		            System.out.println("Welcome "+ nm);
		            break;
		

		        } else {


		            System.out.println("Incorrect Login");
		            totalAttempts--;
		            System.out.println(totalAttempts);

		        }

		    }

		    if (totalAttempts == 0) {

		        System.out.println("Contact to Admin");
		    }
		}
	

}
