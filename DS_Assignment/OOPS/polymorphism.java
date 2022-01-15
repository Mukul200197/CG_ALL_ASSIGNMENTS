import java.util.*;
class Employee{
	String nm;
	int basic,da,hra,intensive;
	Scanner sc=new Scanner(System.in);
	void emp()
	{
		
		System.out.println("Enter Employee Name");
		nm=sc.nextLine();
		
	}
  }
 
class Manager extends Employee{
  int tSal=0;
  int basic,da,hra,intensive;
  void emp()
  {
	  	System.out.println("Enter Basic sal: ");
		basic=sc.nextInt();
		System.out.println("Enter HRA: ");
		hra=sc.nextInt();
		System.out.println("Enter DA: ");
		da=sc.nextInt();
	  System.out.println("Enter Intensive: ");
	  intensive=sc.nextInt();
	  hra=(hra*basic)/100;
	  da=(da*basic)/100;
	  
	  tSal=(basic+da+hra+intensive);
	  System.out.println("Total Salary of Employee: " + tSal);
  }
}


class Labor extends Employee{
	
	int overtime=1000;
	int salary,total;
	void emp() {
		System.out.println(" Enter Total Salary of Employee: ");
		int salary=sc.nextInt();
		
		total=salary+overtime;
		System.out.println("Salary with overtime:" + total);
		
	}
}


public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.emp();
		Employee m1=new Manager();
		m1.emp();
		Employee e2=new Employee();
		e2.emp();
		Employee l1=new Labor();
		l1.emp();
	}

}

