
import java.util.*;
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, x, flag = 0, i = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.print("Enter the element you want to find:");
		x = s.nextInt();
		for(i = 0; i < n; i++)
		{
			if(a[i] == x)
			{
				flag = 1;
				break;
			}

		}
		if(flag == 1)
		{
			System.out.println(x + " Search number is found at position: "+i);
		}

	}
}
