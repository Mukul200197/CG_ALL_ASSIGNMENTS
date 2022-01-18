
import java.io.*;
import java.util.*;
class Employee{

	private int id,sal;
	private String name,dept;

	// constructor
	public Employee(int id, String name, String dept, int sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public int getID()
    {
        return id;
    }
	public String getDept()
    {
        return dept;
    }
	public int getSal()
    {
        return sal;
    }
	
}


class myNameComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}

class Employee3 {

	public static void main (String[] args){
		
		
		TreeSet<Employee> set= new TreeSet<Employee>(new myNameComparator());
		set.add(new Employee(450,"Sam", "Technical", 20000));
		set.add(new Employee(450,"Rahul", "NonTechnical", 20000));
		set.add(new Employee(450,"Rohit", "OfficeBoy", 20000));
		set.add(new Employee(450,"Satyajeet", "field", 20000));
		set.add(new Employee(450,"Ajinkya", "Data Analyst", 20000));
		set.add(new Employee(450,"Mukul", "Analyst", 20000));
		set.add(new Employee(450,"Rutuja", "Database", 20000));
		set.add(new Employee(450,"Omkar", "Developer", 20000));
		set.add(new Employee(450,"Samarth", "Technical", 20000));
		
		//System.out.println("increasing Order with the Marks");
		
		// Printing the TreeSet elements
		for(Employee ele: set)
		{
			System.out.print(ele.getName()+" "+ele.getID()+ " "+ele.getDept()+" "+ele.getSal());
			System.out.println();
		}
		
		
		

	}
}
