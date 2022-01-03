package µÚÈıÕÂÁ·Ï°;
import java.util.Scanner;
import java.util.Random;
public class twostar1_3_4 {
	public static void main(String[] args) {
		String [] a={"January","February","March","April","May","June","July","August","September","Octorber","November","December"};
		Random r=new Random();
		int n=r.nextInt(12);
		System.out.println(n+1);
		System.out.println(a[n]);
	}
}
