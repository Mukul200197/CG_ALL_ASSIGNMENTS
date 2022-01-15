
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String Pool refers to collection of string which are stored in heap memory";
		
		String s1=str.toLowerCase();
		System.out.println("1. LowerCase: " + s1);
		String s2=str.toUpperCase();
		System.out.println("2. UpperCase: " + s2);
		
		String s3=str.replace('a', '$');
		System.out.println("3. Replace  : " + s3);
		
		System.out.println( "Original String Contains Collection? " + str.contains("collection"));
		System.out.println(str.equals("java string pool refers to collection of strings which are stored in heap memory"));
		
		String str2="Java String Pool refers to collection of string which are stored in heap memory";
		System.out.println(str==str2);
		
	}
	

}
