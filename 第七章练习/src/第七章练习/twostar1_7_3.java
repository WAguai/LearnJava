package ��������ϰ;
import java.util.Scanner;
public class twostar1_7_3 {
	public static void main(String[] args) {
		int []a,b;
		Scanner input=new Scanner(System.in);
		System.out.printf("����1~100��");
		String line =input.nextLine();
		String fuck[]=line.split(" ");
		a = new int[fuck.length];
		b= new int[101];
		for(int i=0;i<fuck.length;i++) {
			a[i]=Integer.parseInt(fuck[i]);
			b[a[i]]++;
		}
		for(int i=0;i<100;i++) {
			if(b[i]!=0)System.out.println(i+"������"+b[a[i]]+"��");
		}
	}
}
