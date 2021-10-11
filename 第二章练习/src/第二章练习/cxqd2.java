package µÚ¶şÕÂÁ·Ï°;
import java.util.Scanner;
public class cxqd2 {
	public static void main(String[] argc) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area =radius*radius*3.14159;
		System.out.println("The area for the ciircle of radius "+radius+" is "+area);
	}
}
