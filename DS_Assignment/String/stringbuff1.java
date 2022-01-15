
public class stringbuff1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer1=new StringBuffer("StringBuffer");
		buffer1.append("," +"the functionality of string");
		System.out.println(buffer1);
		
		StringBuffer buffer2=new StringBuffer("it is used to at the specified index position");
		buffer2.insert(14 ,"insert text ");
		System.out.println(buffer2);
		
		StringBuffer buf3=new StringBuffer("This method is used to return the reverse object on which it was called");
		buf3.reverse();
		System.out.println(buf3);



	}

}
