package 第七章练习;
import java.util.Scanner;
public class twostar2_7_5 {
	public static void main(String[] args) {
		int []a,b;
		Scanner input=new Scanner(System.in);
		System.out.printf("输入十个数：");
		String line =input.nextLine();
		String fuck[]=line.split(" ");
		a = new int[fuck.length];
		b= new int[101];
		int count=0;
		for(int i=0;i<fuck.length;i++) {
			a[i]=Integer.parseInt(fuck[i]);
			if (b[a[i]]==0) {
				b[a[i]]=1;
				count++;
			}
		}
		System.out.println("有不一样的数："+count+"个");
		System.out.printf("他们是：");
		for(int i=0;i<fuck.length;i++) {
			if(b[a[i]]==1) {
				b[a[i]]=0;
				System.out.printf("%d ",a[i]);
			}
			
		}
	}
}
