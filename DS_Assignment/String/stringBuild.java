
public class stringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder buf=new StringBuilder("StringBuilder, is a peer of a String");
		buf.append(", "+"that provides much of");
		buf.append(","+" the functionalities of string");
		System.out.println(buf);
		
		StringBuilder buffer=new StringBuilder("it is used to at the specified index position");
		buffer.insert(14 ,"insert text ");
		System.out.println(buffer);
		
		
		StringBuilder buffer1=new StringBuilder("This method is used to return the reverse object on which it was called");
		buffer1.reverse();
		System.out.println(buffer1);

	}

}
