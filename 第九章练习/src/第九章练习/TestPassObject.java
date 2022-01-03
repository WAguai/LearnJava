package µÚ¾ÅÕÂÁ·Ï°;

public class TestPassObject {
	public static void main(String[] args) {
		Circle myCircle=new Circle(1);
		int n=5;
		printAreas(myCircle,n);
	}
	public static void printAreas(Circle c, int times) {
		System.out.println("Radius\t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}
}
