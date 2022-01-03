package µÚ¾ÅÕÂÁ·Ï°;
public class onestar4_9_6 {
	public static void main(String[] args) {
		int[] data=new int[100000];
		StopWatch watch=new StopWatch();
		for(int i=0;i<100000;i++) {
			data[i]=(int)(Math.random()*10000);
		}
		watch.start();
		for(int i=0;i<100000;i++) {
			int maxData=data[i];
			int maxIndex=i;
			for(int j=i+1;j<100000;j++) {
				if(maxData<data[j]) {
					maxIndex=j;
					maxData=data[j];
				}
			}
			if(maxIndex!=i) {
				int item=data[i];
				data[i]=maxData;
				data[maxIndex]=item;
			}
		}
		watch.stop();
		System.out.print(watch.getElapsedTime());
	}
}
