package µÚÎåÕÂÁ·Ï°;
import java.util.Scanner;
public class twostar4_5_21 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("Loan Amount: ");
		double loanAmount=input.nextDouble();
		System.out.printf("Number of years: ");
		int numberOfYears=input.nextInt();
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		for(double i=5.000;i<=8.000;i=i+0.125) {
			double monthlyPayment=loanAmount*i/12/100/(1-1/Math.pow(1+i/12/100,numberOfYears*12));
			double totalPayment=monthlyPayment*12*numberOfYears;
			System.out.printf("%.3f%%           %.2f             %.2f\n",i,monthlyPayment,totalPayment);
		}
	}
}
