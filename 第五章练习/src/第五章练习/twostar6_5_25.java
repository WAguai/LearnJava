package µÚÎåÕÂÁ·Ï°;

public class twostar6_5_25 {
	public static void main(String [] args) {
		for(int j=1;j<=10;j++) {
			double ans=0;
			int f=1;
			for(int i=1;i<=10000*j;i++) {
				double add=1.0/(2*i-1);
				ans=ans+f*add;
				f=-f;
			}
			System.out.printf("%.6f\n",ans*4);	
		}	
	}
}
