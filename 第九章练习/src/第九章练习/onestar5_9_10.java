package µÚ¾ÅÕÂÁ·Ï°;
import java.util.*;
public class onestar5_9_10 {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		QuadraticEquation q= new QuadraticEquation(a,b,c);
		if(q.getDiscriminant()>0) {
			System.out.printf(q.getRoot1()+" "+q.getRoot2()+"\n");
		}
		else if(q.getDiscriminant()==0) {
			System.out.println(q.getRoot1());
		}
		else {
			System.out.println("The equation has no roots");
		}
	}
}
