package µÚ¶þÕÂÁ·Ï°;
import java.util.Scanner;
public class cxqd9 {
	public static void main(String[] argc) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate, for example,7.25");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate /1200;
		System.out.print("enter number of years as an integer,for example,7.25");
		int numberOfYears= input.nextInt();
		double loanAmount= input.nextDouble();
		double monthlyPayment = loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println("The monthly payment is$"+(int)(monthlyPayment *100)/100.0);
		System.out.println("The total payment is $"+(int)(totalPayment *100)/100.0);
		}
}
