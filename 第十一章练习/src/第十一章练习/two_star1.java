package µÚÊ®Ò»ÕÂÁ·Ï°;
import java.util.*;
public class two_star1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <Integer> a =new ArrayList<>();
        int x=(int)(Math.random()*10);  
        int y=(int)(Math.random()*10);
	    Scanner input=new Scanner(System.in);
	    System.out.println("What is "+"x "+"y"+"?");
	    int n=input.nextInt();
	    while(n!=x+y) {
	    	if(a.contains(n)) {
	    		System.out.println("you already entered "+n);
	    	}
	    	else {
	    		System.out.println("wron answer!");
	    	}
	    n=input.nextInt();
	    }
	    System.out.println("you got it!");
	    
	}

}
