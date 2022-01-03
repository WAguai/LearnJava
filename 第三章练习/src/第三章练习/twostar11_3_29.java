package 第三章练习;
import java.util.Scanner;
public class twostar11_3_29 {
	public static void main(String []args) {
		Scanner r=new Scanner(System.in);
		System.out.println("输入第一个圆的中点和半径：");
		double x1=r.nextDouble(),y1=r.nextDouble(),r1=r.nextDouble();
		System.out.println("输入第二个圆的中点和半径：");
		double x2=r.nextDouble(),y2=r.nextDouble(),r2=r.nextDouble();
		double d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(d<(r1-r2)) {
			System.out.println("第二个圆在第一个圆里");
		}
		else if(d>r1+r2) {
			System.out.println("第二个圆在第一个圆外");
		}
		else {
			System.out.println("第二个圆和第一个圆重叠");
		}

	}
}
