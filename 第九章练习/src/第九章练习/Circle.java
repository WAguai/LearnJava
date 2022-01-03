package 第九章练习;

public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();
		System.out.println("the area of circle1 of radius "+circle1.radius+" is "+circle1.getArea());
		
		Circle circle2=new Circle(25);
		System.out.println("the area of circle2 of radius "+circle2.radius+" is "+circle2.getArea());

		Circle circle3=new Circle(125);
		System.out.println("the area of circle3 of radius "+circle3.radius+" is "+circle3.getArea());
		
		circle2.radius=100;
		System.out.println("the area of circle2 of radius "+circle2.radius+" is "+circle2.getArea());	
	}
	
	double radius;
	//清单9要用的
	static int numberOfObjects=0;
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	Circle(){
		radius=1;
		numberOfObjects++;
	}
	Circle(double newRadius){	//构造函数
		radius=newRadius;
		numberOfObjects++;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;	
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}