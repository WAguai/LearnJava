package 第三章练习;
import java.util.Scanner;
public class twostar10_3_28 {
	public static void main(String []args) {
		Scanner r=new Scanner(System.in);
		System.out.println("输入第一个矩形的中点和长宽：");
		double x1=r.nextDouble(),y1=r.nextDouble(),w1=r.nextDouble(),h1=r.nextDouble();
		System.out.println("输入第二个矩形的中点和长宽：");
		double x2=r.nextDouble(),y2=r.nextDouble(),w2=r.nextDouble(),h2=r.nextDouble();
		if(x1-Math.abs(x1-x2)-w2/2.0>=x1-w1/2.0&&x1+Math.abs(x1-x2)+w2/2.0<=x1+w1/2.0&&
				y1-Math.abs(y1-y2)-h2/2.0>=y1-h1/2.0&&y1+Math.abs(y1-y2)+h2/2.0<=y1+h1/2.0) {
			System.out.println("第二个矩形在第一个矩形里");
		}
		else if(x1-x2+w2/2.0<=x1-w1/2.0||x1+x2-w2/2.0>=x1+w1/2.0||y1-y2+h2/2.0<=y1-y1/2.0||y1+y2-h2/2.0<=y1+h1/2.0) {
			System.out.println("第二个矩形在第一个矩形外");
		}
		else {
			System.out.println("第二个矩形和第一个矩形重叠");
		}

	}
}
