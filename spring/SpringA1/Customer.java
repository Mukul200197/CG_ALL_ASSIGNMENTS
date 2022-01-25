
public class Customer {
	
	private String custNM,custID,custNO;
	
	private Address address;

	public String getCustNM() {
		return custNM;
	}

	public void setCustNM(String custNM) {
		this.custNM = custNM;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getCustNO() {
		return custNO;
	}

	public void setCustNO(String custNO) {
		this.custNO = custNO;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void show(){  
	    System.out.println(custID+" "+custNM+" "+custNO);  
	    System.out.println(address);  
	}  
}  