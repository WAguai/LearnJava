package µÚÎåÕÂÁ·Ï°;
import java.util.ArrayList;
import java.util.Scanner;
public class twostar8_5_28 {
	ArrayList a=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		int weekday=input.nextInt();
		String []month = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		String []weekdays=new String[] {"Sunday","monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int [][]days= new int[][]{{31,28,31,30,31,30,31,31,30,31,30,31},
					{31,29,31,30,31,30,31,31,30,31,30,31}};
		int index=0;
		weekday=weekday%7;
		if(year%400==0||year%4==0&&year%100!=0) index=1;
		for(int i=0;i<=11;i++) {
			System.out.printf("%s 1,%d is %s\n",month[i],year,weekdays[weekday]);
			weekday=(weekday+days[index][i])%7;
		}
	}	

}