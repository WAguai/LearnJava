package ��ʮһ����ϰ;

public class TestCircleRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(1);
		System.out.println("һ��Բ������"+circle.toString());
		System.out.println("��ɫ�� "+circle.getColor());
		System.out.println("�뾶�� "+circle.getRadius());
		System.out.println("����� "+circle.getArea());
		System.out.println("ֱ���� "+circle.getDiameter());
		Rectangle t=new Rectangle(2,4);
		System.out.println("\nһ��������"+t.toString());
		System.out.println("�����"+t.getArea());
		System.out.println("�ܳ���"+t.getPerimeter());
		
	}
	
}

