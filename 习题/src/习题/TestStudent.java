package ϰ��;
import java.util.*;
public class TestStudent {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Student> students=new TreeSet<Student>();
		System.out.println("������ѧ����Ϣ:(ѧ�� ���� ����)");
		while (true) {
			// ������ʾ	
			String inputData = input.nextLine();
			if ("exit".equals(inputData)) {
				break;
			}
			String[] info = inputData.split(" ");
			// ��������Ϣ��װ��Student������
			Student student = new Student(Integer.parseInt(info[0]), info[1],Integer.parseInt(info[2]));
			// ��ѧ��������뼯��
			students.add(student);
		}
		for(Student s:students){
			System.out.println(s.getName()+"-----"+s.getNumber()+"------"+s.getAge());
		}

	}
}