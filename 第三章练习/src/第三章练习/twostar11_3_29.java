package ��������ϰ;
import java.util.Scanner;
public class twostar11_3_29 {
	public static void main(String []args) {
		Scanner r=new Scanner(System.in);
		System.out.println("�����һ��Բ���е�Ͱ뾶��");
		double x1=r.nextDouble(),y1=r.nextDouble(),r1=r.nextDouble();
		System.out.println("����ڶ���Բ���е�Ͱ뾶��");
		double x2=r.nextDouble(),y2=r.nextDouble(),r2=r.nextDouble();
		double d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(d<(r1-r2)) {
			System.out.println("�ڶ���Բ�ڵ�һ��Բ��");
		}
		else if(d>r1+r2) {
			System.out.println("�ڶ���Բ�ڵ�һ��Բ��");
		}
		else {
			System.out.println("�ڶ���Բ�͵�һ��Բ�ص�");
		}

	}
}
