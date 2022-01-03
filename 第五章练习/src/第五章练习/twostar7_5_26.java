package µÚÎåÕÂÁ·Ï°;

public class twostar7_5_26 {
	public static void main(String[]args) {
		for(int j=1;j<=10;j++) {
			double ans=1;
			for(int i=1;i<=10000*j;i++) {
				double add=f(i);
				//System.out.printf("%.6f ",add);
				ans+=add;
			}
			System.out.printf("%.6f\n",ans);	
		}
	}
	public static double f(int x) {
		double ans=1.0;
		for(int i=1;i<=x;i++) {
			ans/=i;
		}
		return ans;
	}
	
}
