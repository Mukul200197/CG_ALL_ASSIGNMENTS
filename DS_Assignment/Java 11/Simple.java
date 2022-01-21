import java.util.Scanner;
@FunctionalInterface
interface interest{
	int formula(int a,int b, int c);
}
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,r,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		p = sc.nextInt();
		System.out.println("Enter the rate: ");
		r = sc.nextInt();
		System.out.println("Enter the time: ");
		t = sc.nextInt();
		interest si = (a, b, c) -> (a*b*c)/100;
		int ans = si.formula(p,r,t);
		System.out.println("Simple Interest: " +ans);
	}

}
