package ��������ϰ;
import java.util.Scanner;
public class twostar10_3_28 {
	public static void main(String []args) {
		Scanner r=new Scanner(System.in);
		System.out.println("�����һ�����ε��е�ͳ���");
		double x1=r.nextDouble(),y1=r.nextDouble(),w1=r.nextDouble(),h1=r.nextDouble();
		System.out.println("����ڶ������ε��е�ͳ���");
		double x2=r.nextDouble(),y2=r.nextDouble(),w2=r.nextDouble(),h2=r.nextDouble();
		if(x1-Math.abs(x1-x2)-w2/2.0>=x1-w1/2.0&&x1+Math.abs(x1-x2)+w2/2.0<=x1+w1/2.0&&
				y1-Math.abs(y1-y2)-h2/2.0>=y1-h1/2.0&&y1+Math.abs(y1-y2)+h2/2.0<=y1+h1/2.0) {
			System.out.println("�ڶ��������ڵ�һ��������");
		}
		else if(x1-x2+w2/2.0<=x1-w1/2.0||x1+x2-w2/2.0>=x1+w1/2.0||y1-y2+h2/2.0<=y1-y1/2.0||y1+y2-h2/2.0<=y1+h1/2.0) {
			System.out.println("�ڶ��������ڵ�һ��������");
		}
		else {
			System.out.println("�ڶ������κ͵�һ�������ص�");
		}

	}
}
