package µÚÈıÕÂÁ·Ï°;
import java.util.Scanner;
import java.util.Random;
public class twostar8_3_24 {
	public static void main(String []args) {
		String [] a= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String [] b= {"Clubs","Diamonds","Hearts","Spades"};
		Random r = new Random();
		int aa=r.nextInt(13);
		int bb=r.nextInt(4);
		System.out.println("The card you picked is "+a[aa]+" of "+b[bb]);
	}
}
