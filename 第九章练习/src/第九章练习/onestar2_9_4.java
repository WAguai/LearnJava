package µÚ¾ÅÕÂÁ·Ï°;
import java.util.Random;
public class onestar2_9_4 {
	public static void main(String[]args) {
		Random r=new Random();
		r.setSeed(1000);
		int n=50;
		while(n>0) {
			System.out.printf("%d ",r.nextInt(100));
			n--;
		}
	}
}
