import java.util.*;
public class IntrestRate {

	public static void main(String[] args) {
		//float compound;
		Scanner sc=new Scanner(System.in);	
			
		System.out.println("Enter Principle Amount");
		float amnt=sc.nextFloat();		
		System.out.println("Enter Time");
		float t=sc.nextFloat();
		System.out.println("Enter Rate");
		float rate=sc.nextFloat();
		
		float simple=(amnt*t*rate)/100;
		double compound=amnt*((1+rate/100)*(1+rate/100)*(1+rate/100))- amnt;
		
		System.out.println("Simple Intrest Rate "+ simple);
		System.out.println("Compound Intrest Rate "+ compound);
	}

}
