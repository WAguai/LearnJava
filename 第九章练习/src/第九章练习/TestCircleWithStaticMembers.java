package 第九章练习;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("在建立元素前：");
		System.out.println("圆元素的数量是："+Circle.numberOfObjects);
		
		Circle c1=new Circle();
		System.out.println("在建立一个元素c1后：");
		System.out.println("c1圆元素半径为："+c1.radius+"圆的面积为："+c1.getArea());
		System.out.println("圆元素的数量是："+c1.numberOfObjects);
		
		Circle c2=new Circle();
		c1.radius=9;
		System.out.println("在建立了两个元素c1、c2，并更改c1的半径后：");
		System.out.println("c1圆元素半径为："+c1.radius+"圆的面积为："+c1.getArea());
		System.out.println("c2圆元素半径为："+c2.radius+"圆的面积为："+c2.getArea());
		System.out.println("圆元素的数量是："+c1.numberOfObjects);
		System.out.println("圆元素的数量是："+c2.numberOfObjects);
		System.out.println("圆元素的数量是："+Circle.numberOfObjects);
		
			
	}
}
