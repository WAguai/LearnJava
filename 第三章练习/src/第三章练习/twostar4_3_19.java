package 第三章练习;
import java.util.*;
public class twostar4_3_19 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		if(a+b>c&&b+c>a&&a+c>b)
			System.out.printf("周长为：%d\n",a+b+c);
		else
			System.out.printf("非法\n");
	}
}
