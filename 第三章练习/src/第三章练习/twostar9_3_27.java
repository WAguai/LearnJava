package 第三章练习;
import java.util.Scanner;
public class twostar9_3_27 {
	public static void main(String[] argc) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入坐标：");
		double x=input.nextDouble(),y=input.nextDouble();
		if(x<=200&&x>=0&&y<=100&&y>=0&&(y<-0.5*x+100)) {
			System.out.printf("Point (%.1f,%.1f) is in the triangle\n",x,y);
		}
		else { 
			System.out.printf("Point (%.1f,%.1f) is not in the triangle\n",x,y);
		}
	}
}
