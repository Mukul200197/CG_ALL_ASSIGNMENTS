import java.util.*;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> map=new HashSet<String>();
		
		map.add("CAR");
		map.add("Bike");
		map.add("Mobile");
		map.add("Television");
		map.add("BAG");
		map.add("Bike"); //try to add Duplicate Values
		map.add("CAR");  //try to add Duplicate Values
		map.add("Book");
		map.add("Airoplane");
		map.add("Laptop");
		
		
		System.out.println("Unique Products: " + map);
	}

}
