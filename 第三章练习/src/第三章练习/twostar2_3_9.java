package 第三章练习;
import java.util.Scanner;
public class twostar2_3_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入前9位ISBN码：");
		String qian9=input.nextLine();
		int sum=0;
		int j=9;
		int f=Integer.parseInt(qian9);
		while(f>0) {
			sum=sum+f%10*j;
			f=f/10;
			j--;
		}
		
		System.out.println("ISBN-10为: "+qian9+(sum%11==10?"X":sum%11));
	}
}
