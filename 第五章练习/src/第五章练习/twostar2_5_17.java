package µÚÎåÕÂÁ·Ï°;
import java.util.Scanner;
public class twostar2_5_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			int f=i;
			for(int j=1;j<=2*n-1;j++) {
				if(j<=n-i||j>=n+i) {
					System.out.printf("     ");
				}
				else {
					System.out.printf("%5d",f);
					if(j+1<=n)f--;
					else f++;
				}
			}
			System.out.println("");
			
		}
	}
}
