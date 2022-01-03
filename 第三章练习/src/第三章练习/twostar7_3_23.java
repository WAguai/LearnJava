package 第三章练习;
import java.util.Scanner;
public class twostar7_3_23 {
	public static void main(String[] argc) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入坐标：");
		double x=input.nextDouble(),y=input.nextDouble();
		if(Math.abs(x)<=5&&Math.abs(y)<=2.5) {
			System.out.printf("Point (%.1f,%.1f) is in the rectangle\n",x,y);
		}
		else { 
			System.out.printf("Point (%.1f,%.1f) is not in the rectangle\n",x,y);
		}
	}
}
