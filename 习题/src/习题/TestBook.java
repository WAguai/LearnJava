package ϰ��;
import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int totalbooknum=input.nextInt();
		Map<String,BookAttribute> booksinmap=new HashMap<String,BookAttribute>();
		List<BookAttribute> booksinlist = new ArrayList<BookAttribute>();
		for(int i=0;i<totalbooknum;i++) {
			String booknumber=input.next();
			String name=input.next();
			double  price=input.nextDouble();
			String publisher=input.next();
			booksinmap.put(booknumber,new BookAttribute(booknumber,name,price,publisher));
			booksinlist.add(new BookAttribute(booknumber,name,price,publisher));
		}
		System.out.println("��map�е�Ԫ�أ�");
		System.out.println("���\t\t����\t\t�۸�\t\t������");
		Iterator iter=booksinmap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(
					entry.getKey()+"\t\t"+
					((BookAttribute)entry.getValue()).getName()+"\t\t"+
					((BookAttribute)entry.getValue()).getPrice()+"\t\t"+
					((BookAttribute)entry.getValue()).getPublisher()
					);
		}
		
		System.out.println("��list�е�Ԫ��:");
		System.out.println("���\t\t����\t\t�۸�\t\t������");
		for(int i=0;i<totalbooknum;i++) {
			System.out.println(
					booksinlist.get(i).getBookNumber()+"\t\t"+
					booksinlist.get(i).getName()+"\t\t"+
					booksinlist.get(i).getPrice()+"\t\t"+
					booksinlist.get(i).getPublisher()
					);
		}
	}

}
