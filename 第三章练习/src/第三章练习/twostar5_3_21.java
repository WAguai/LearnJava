package 第三章练习;
import java.util.Scanner;
public class twostar5_3_21 {
	public static void main(String []argc) {
		int y,h,q,m,j,k;
		String []a= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		Scanner input=new Scanner(System.in);
		System.out.println("输入年：");
		y=input.nextInt();
		System.out.println("输入月：");
		m=input.nextInt();
		System.out.println("输入日：");
		q=input.nextInt();
		if(m==1||m==2) {
			m+=12;
			y-=1;
		}
		j=y/100;
		k=y%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.println(a[h]);
	}
}
