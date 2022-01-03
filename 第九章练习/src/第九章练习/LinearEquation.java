package µÚ¾ÅÕÂÁ·Ï°;

public class LinearEquation {
	private float a,b,c,d,e,f;
	public LinearEquation(float a,float b,float c,float d,float e,float f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
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
	public float getD() {
		return this.d;
	}
	public float getE() {
		return this.e;
	}
	public float getF() {
		return this.f;
	}
	public boolean isSolvable() {
		if(this.a*this.d-this.b*this.c!=0)return true;
		return false;
	}
	public float getX() {
		return (this.d*this.e-this.b*this.f)/(this.d*this.a-this.b*this.c);
	}
	public float getY() {
		return (this.a*this.f-this.e*this.c)/(this.d*this.a-this.b*this.c);
	}
}
