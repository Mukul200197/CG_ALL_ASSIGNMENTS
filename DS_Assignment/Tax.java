import java.util.*;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tax=0,ctc;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC");
		ctc=sc.nextFloat();
		
		if(ctc<180000) {
			System.out.println(tax);
		}
		else if(ctc>180000 && ctc<=300000) {
			tax=ctc/100*10;
			System.out.println("Tax Payable: " +tax);
		}
		else if(ctc >300000 && ctc<=500000) {
			tax=ctc/100*20;
			System.out.println("Tax Payable: " +tax);
		}
		else if(ctc >500000 && ctc<=1000000) {
			tax=ctc/100*30;
			System.out.println("Tax Payable: " +tax);
		}
	}

}
