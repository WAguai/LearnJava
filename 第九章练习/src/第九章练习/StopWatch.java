package µÚ¾ÅÕÂÁ·Ï°;
public class StopWatch {
	private double startTime;
	private double endTime;
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public double getElapsedTime() {
		return endTime-startTime;
	}
}
