import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Subject Mark");
        int sub1=sc.nextInt();
        System.out.println("Enter 2nd Subject Mark");
        int sub2=sc.nextInt();
        System.out.println("Enter 3rd Subject Mark");
        int sub3=sc.nextInt();
        
        if(sub1>60 && sub2>60 && sub3>60) {
        	System.out.println("Student is Passed");
        }
        else if((sub1>60 && sub2>60)|| (sub2>60 && sub3>60)||(sub1>60 && sub3>60)) {
        	System.out.println("Promoted");
        }
        else {
        	System.out.println("Failed");
        }

	}

}
