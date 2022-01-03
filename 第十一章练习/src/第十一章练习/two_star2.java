package µÚÊ®Ò»ÕÂÁ·Ï°;
import java.util.*;
public class two_star2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer m£º");
        int m=input.nextInt();
        int x=m;
        ArrayList <Integer> a=new ArrayList<>();
        for (int i=2;i<=Math.sqrt(x);i++) {
        	if(sushu(i)) {
        		if(m%i==0) {
        			m/=i;
        			a.add(i);
        			i--;
        		}
        		if(m==1) {
        			break;
        		}
        	}
        }
        int n=1;
        int flag=1;
        for(int i:a) {
        	if(Count(i,a)%2!=0&&flag!=i){
        		n*=i;
        		flag=i;
        	}
        }
        System.out.println("The smallest number n for n*m to be a perfect number is "+n);
	    System.out.println(n+"*"+x+" is "+n*x);
	}
	public static boolean sushu(int x){

        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return  false;
            }
        }
        return true;
    }
	public static int Count(int m,ArrayList<Integer> q) {
		int count=0;
		for(int i:q) {
			if(i==m) {
				count+=1;
			}
		}
		return count;
	}
}
