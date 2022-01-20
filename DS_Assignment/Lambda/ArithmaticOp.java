import java.util.*;

interface Arithmetic{
	int op(int a,int b);
}

public class ArithmaticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:1.Add,2.Sub,3.Mul,4.Div");
		int no=sc.nextInt();
		System.out.println("Enter Two Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(no)
		{
		case 1:
			Arithmetic add= (int x,int y)-> a+b;
			int addition= add.op(a, b);
			System.out.println(addition);
		case 2:
			Arithmetic sub=(int x,int y)->a-b;
			int substraction=sub.op(a, b);
			System.out.println(substraction);
			
		case 3:
			Arithmetic mul= (int x,int y)->a*b;
			int multiplication=mul.op(a, b);
			System.out.println(multiplication);
			
		case 4:
			Arithmetic div= (int x,int y)->a/b;
			int division=div.op(a, b);
			System.out.println(division);
		}
			
		
	}

}
