package 第十一章练习;

public class TestCircleRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(1);
		System.out.println("一个圆建立了"+circle.toString());
		System.out.println("颜色是 "+circle.getColor());
		System.out.println("半径是 "+circle.getRadius());
		System.out.println("面积是 "+circle.getArea());
		System.out.println("直径是 "+circle.getDiameter());
		Rectangle t=new Rectangle(2,4);
		System.out.println("\n一个三角形"+t.toString());
		System.out.println("面积是"+t.getArea());
		System.out.println("周长是"+t.getPerimeter());
		
	}
	
}

