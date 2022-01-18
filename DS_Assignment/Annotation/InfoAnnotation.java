import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	String Dev_nm();
}
@Info(Dev_nm="Mukul")
class developer{
	int Dev_Id;
	String date;
	String time;
	int version;
	public developer(int dev_Id, String date, String time, int version) {
		super();
		Dev_Id = dev_Id;
		this.date = date;
		this.time = time;
		this.version = version;
	}
	
	
}

public class InfoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		developer d1=new developer(10, "18/01/2022", "12PM", 10);
		System.out.println("DveloperID "+ d1.Dev_Id);
		System.out.println("Date " + d1.date);
		System.out.println("Time " + d1.time);
		System.out.println("Version " + d1.version);
		Class c1=d1.getClass();
		Annotation A1=c1.getAnnotation(Info.class);
		Info in=(Info)A1;
		System.out.println("---------From Custom Annotation----------");
		System.out.println("DeveloperName: " + in.Dev_nm());
	}

}
