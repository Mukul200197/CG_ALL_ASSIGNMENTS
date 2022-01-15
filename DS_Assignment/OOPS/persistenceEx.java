
abstract class Persistance{
	abstract public void persist();
}

class filePersistance extends Persistance {
	public void persist() {
		System.out.println("File saved in File Persistence...");
	}
}

class databasePersistance extends Persistance {
	public void persist() {
		System.out.println("File saved in database Persistence...");
	}
}



public class persistenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistance p=new filePersistance();
		Persistance p1=new databasePersistance();
		p.persist();
		p1.persist();
	}

}
