package ��������ϰ;
import java.util.*;
public class twostar4_3_19 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		if(a+b>c&&b+c>a&&a+c>b)
			System.out.printf("�ܳ�Ϊ��%d\n",a+b+c);
		else
			System.out.printf("�Ƿ�\n");
	}
}
