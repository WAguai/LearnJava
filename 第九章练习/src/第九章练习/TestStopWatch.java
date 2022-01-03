package µÚ¾ÅÕÂÁ·Ï°;
import java.util.Random;
public class TestStopWatch {
	public static void main(String[] args) {
		StopWatch s=new StopWatch();
		Random r=new Random();
		int[] a=new int[100000];
		for(int i=0;i<=99999;i++){
			a[i]=r.nextInt(10000);
		}
		s.start();
		for(int i=0;i<=99999;i++) {
			int min=a[i];
			int index=i;
			for(int j=i+1;j<=99999;j++) {
				if(min>a[j]) {
					min=a[j];
					index=j;	
				}
			}
			a[index]=a[i];
			a[i]=min;
		}
		s.stop();
		System.out.println(s.getElapsedTime());
		}
}
