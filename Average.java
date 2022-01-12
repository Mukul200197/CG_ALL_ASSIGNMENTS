 import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mark[][]=new float[3][3];
		float tmark=0;
		
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
		
		System.out.println("Enter Student Marks");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mark[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				tmark+=mark[i][j];
			}
		}
		
		System.out.println("Total marks in all subjects is: "+ tmark); System.out.println("Average marks in all subjects is: "+ tmark/9);

		tmark = 0;

		for(int i=0; i<3; i++)
		{
		tmark=0;
		for (int j=0; j<3; j++)
		{
			tmark +=mark[i][j];
		}

		System.out.println("Total marks for student "+ (i+1) +" of each subject is: "+ tmark) ; 
		System.out.println("Average marks for student "+ (i+1)+" of each subject is: "+ tmark/3); 
		System.out.println();

		tmark = 0;
		
		}
		
	}

}
