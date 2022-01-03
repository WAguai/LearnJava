package µÚ¾ÅÕÂÁ·Ï°;

import java.util.Scanner;

public class onestar6_9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		float d=input.nextFloat();
		float e=input.nextFloat();
		float f=input.nextFloat();
		LinearEquation l=new LinearEquation(a,b,c,d,e,f);
		if(l.isSolvable()) {
			System.out.println("x:"+l.getX()+",y:"+l.getY());
		}
		else {
			System.out.println("The equation has no solution");
		}
	}

}
