package µÚÎåÕÂÁ·Ï°;
import java.util.Scanner;
public class twostar1_5_7 {
	public static void main(String []args) {
		double xf=10000;
		double zz=0.05;
		int c=10;
		while(c!=0) {
			xf=xf*(1+zz);
			c--;
		}
		double sumf=0;
		c=4;
		System.out.println(xf);
		while(c!=0) {
			sumf+=xf;
			xf=xf*(1+zz);
			c--;
		}
		System.out.println(sumf);
		
	}
}
