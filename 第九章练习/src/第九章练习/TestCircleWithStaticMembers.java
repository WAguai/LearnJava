package �ھ�����ϰ;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("�ڽ���Ԫ��ǰ��");
		System.out.println("ԲԪ�ص������ǣ�"+Circle.numberOfObjects);
		
		Circle c1=new Circle();
		System.out.println("�ڽ���һ��Ԫ��c1��");
		System.out.println("c1ԲԪ�ذ뾶Ϊ��"+c1.radius+"Բ�����Ϊ��"+c1.getArea());
		System.out.println("ԲԪ�ص������ǣ�"+c1.numberOfObjects);
		
		Circle c2=new Circle();
		c1.radius=9;
		System.out.println("�ڽ���������Ԫ��c1��c2��������c1�İ뾶��");
		System.out.println("c1ԲԪ�ذ뾶Ϊ��"+c1.radius+"Բ�����Ϊ��"+c1.getArea());
		System.out.println("c2ԲԪ�ذ뾶Ϊ��"+c2.radius+"Բ�����Ϊ��"+c2.getArea());
		System.out.println("ԲԪ�ص������ǣ�"+c1.numberOfObjects);
		System.out.println("ԲԪ�ص������ǣ�"+c2.numberOfObjects);
		System.out.println("ԲԪ�ص������ǣ�"+Circle.numberOfObjects);
		
			
	}
}
