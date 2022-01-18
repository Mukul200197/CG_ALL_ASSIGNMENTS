import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.of(1997, 8, 21);
		LocalDate d2 = LocalDate.of(1997, 1, 20);
		LocalDate d3 = LocalDate.of(2000, 5, 15);
		LocalDate d4 = LocalDate.of(2004, 12, 19);
		
		LinkedList<LocalDate> list = new LinkedList<LocalDate>();
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		
		for(LocalDate l : list)
		{
			String Date = l.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
			
			if(l.isLeapYear())
			{
				System.out.println("Your Date of Birth " );
				System.out.println(  Date + " and it was a leap year");
			}
			else
			{
				System.out.println("Your Date of Birth ");
				System.out.println( Date + " and it was not a leap year");
			}
		}
		
	}

}
