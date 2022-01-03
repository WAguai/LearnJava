package 第三章练习;
import java.util.Scanner;
public class twostar6_3_22 {
	public static void main(String[] argc) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入坐标：");
		double x=input.nextDouble(),y=input.nextDouble();
		if(x*x+y*y<=100) {
			System.out.printf("Point (%.1f,%.1f) is in the circle\n",x,y);
		}
		else { 
			System.out.printf("Point (%.1f,%.1f) is not in the circle\n",x,y);
		}
	}
}
