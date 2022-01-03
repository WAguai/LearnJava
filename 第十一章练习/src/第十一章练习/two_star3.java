package µÚÊ®Ò»ÕÂÁ·Ï°;
import java.util.*;
public class two_star3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        int maxsize=10;
        System.out.println("Enter the number of objects ");
        int n= input.nextInt();
        System.out.println("Enter the weight of objects ");
        for(int i=0;i<n;i++){
            int x= input.nextInt();
            li.add(x);
        }
        Collections.sort(li);
        Collections.reverse(li);


        int count=0;
        for(int i=0;i<li.size();i++){
            int d=10-li.get(i);
            count++;
            li.remove(i);
            System.out.print("Container  "+count+" "
            		+ " contains objects with weight"+(10-d)+" ");
            for(int j=li.size();j>=i;j--){
                if(li.get(j)<=d){
                    System.out.println(li.get(j));
                    li.remove(j);
                    break;
                }
            }
            i--;
        }
	}

}