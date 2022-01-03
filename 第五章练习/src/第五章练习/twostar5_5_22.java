package µÚÎåÕÂÁ·Ï°;
import java.util.Scanner;
public class twostar5_5_22 {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("Loan Amount: ");
		double loanAmount=input.nextDouble();
		System.out.printf("Number of years: ");
		int numberOfYears=input.nextInt();
		System.out.printf("Annual Interest Rate: ");
		double annualInterestRate=input.nextDouble();
		
		
		double balance=loanAmount;
		double principal=0;
		double interest=0;
		double a=annualInterestRate/12/100/(1-1/Math.pow(1+annualInterestRate/12/100,numberOfYears*12));
		double monthlyPayment=loanAmount*a;
		double totalPayment = monthlyPayment * numberOfYears * 12;
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println(monthlyInterestRate+"   "+monthlyPayment);
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		for(int i=1;i<=numberOfYears*12 ;i++) {
			interest=monthlyInterestRate*balance;
			principal=monthlyPayment-interest;
			balance=balance-principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
		}
	}
}
