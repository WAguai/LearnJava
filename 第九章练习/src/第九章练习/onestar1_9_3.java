package µÚ¾ÅÕÂÁ·Ï°;
import java.util.Date;
public class onestar1_9_3 {
	public static void main(String[] args) {
		Date d=new Date();
		for (int i = 4;i<=11;i++) {
			d.setTime((long) Math.pow(10, i));
			System.out.println(d.toString());
		}
	}
}
