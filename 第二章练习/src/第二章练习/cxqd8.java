package �ڶ�����ϰ;
import java.util.Scanner;
public class cxqd8 {
	public static void main(String[] argc) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		double tax=purchaseAmount*0.06;
		System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
	}
}
