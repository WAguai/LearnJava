package �ھ�����ϰ;

public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		Circle1 myCircle = new Circle1(5.0);
		System.out.println("The area is of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area is of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		System.out.println("The number of objects created is "+Circle1.getNumberOfObjects());

	}
}
