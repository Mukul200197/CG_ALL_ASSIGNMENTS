public class bankAcc{
	public static void main(String[] args)
	{
		bank b=new bank();
		b.display();
		
		b=new saving();
		b.display();
		b=new current();
		b.display();
	}
}


class bank {
	void display()
	{
		System.out.println("account");
	
	}

}


class saving extends bank{
	void display()
	{
		int number=10000;
		System.out.println("saving account holder");
		System.out.println("Fixed deposit:"+number);
	}

}


class current extends bank {
	void display()
	{
		int number=5000;
		System.out.println("Current account holder");
		System.out.println("credit cash:"+number);
	}


}
