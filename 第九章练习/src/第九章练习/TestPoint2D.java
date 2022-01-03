package 第九章练习;
import java.util.Scanner;
public class TestPoint2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入一个点的坐标：");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.print("输入第二个点的坐标：");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p1 is:"+p1.toString());
		System.out.println("p1 is:"+p2.toString());
		System.out.println("距离是:"+p1.distance(p2));
		System.out.println("中点是："+p1.midpoint(p2).toString());
	}
}
