package µÚÎåÕÂÁ·Ï°;
import java.util.Scanner;
public class twostar3_5_19 {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			int f=1;
			for(int j=1;j<=2*8-1;j++) {
				if(j<=8-i||j>=8+i) {
					System.out.printf("    ");
				}
				else {
					System.out.printf("%4d",f);
					if(j+1<=8)f=f*2;
					else f=f/2;
				}
			}
			System.out.println("");
			
		}
	}
}
