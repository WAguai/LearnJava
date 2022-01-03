package µÚ¾ÅÕÂÁ·Ï°;
import java.util.Scanner;
public class QuadraticEquation {
	private float a,b,c;
	public QuadraticEquation(float a,float b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public float getA() {
		return this.a;
	}
	public float getB() {
		return this.b;
	}
	public float getC() {
		return this.c;
	}
	public float getDiscriminant() {
		return this.b*this.b-4*this.a*this.c;
	}
	public float getRoot1() {
		float p=this.getDiscriminant();
		if(p>=0) {
			return (float) ((-this.b+Math.sqrt(p))/(2*this.a));
		}
		return 0;
	}
	public float getRoot2() {
		float p=this.getDiscriminant();
		if(p>=0) {
			return (float) ((-this.b-Math.sqrt(p))/(2*this.a));
		}
		return 0;
	}

}

