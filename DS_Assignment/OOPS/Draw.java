
abstract class shape{
	abstract public void draw();
}

class Line extends shape{
	public void draw() {
		System.out.println("Draw Line");
	}
}

class Cube extends shape{
	public void draw() {
		System.out.println("Draw Cube ");
	}
}

class Rectangle extends shape{
	public void draw() {
		System.out.println("Draw Rectangle ");
	}
}

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l=new Line();
		l.draw();
		Cube c=new Cube();
		c.draw();
		Rectangle R=new Rectangle();
		R.draw();
	}

}
