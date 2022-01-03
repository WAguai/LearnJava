package 第三章练习;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class twostar3_3_15 {
	public static void main(String[] argc) {
		Scanner input=new Scanner(System.in);
		Random r=new Random();
		System.out.println("输入一个三位整数：");
		int hm=input.nextInt();
		int cp=r.nextInt(900)+100;
		
		int []a= {hm%10,hm/10%10,hm/100};
		int []b= {cp%10,cp/10%10,cp/100};
		Arrays.sort(a);
		Arrays.sort(b);
		int gs=0,jj=0,i;
		for(i=0;i<=2;i++) {
			if(a[i]==b[i])gs++;
		}
		if(cp==hm)jj=10000;
		else if(gs==3)jj=3000;
		else if(gs==1)jj=1000;
		System.out.println("号码："+hm);
		System.out.println("彩票："+cp);
		System.out.println("奖金："+jj);
	}
}
