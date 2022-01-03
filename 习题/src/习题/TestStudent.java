package 习题;
import java.util.*;
public class TestStudent {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Student> students=new TreeSet<Student>();
		System.out.println("请输入学生信息:(学号 姓名 年龄)");
		while (true) {
			// 输入提示	
			String inputData = input.nextLine();
			if ("exit".equals(inputData)) {
				break;
			}
			String[] info = inputData.split(" ");
			// 将输入信息封装到Student对象中
			Student student = new Student(Integer.parseInt(info[0]), info[1],Integer.parseInt(info[2]));
			// 将学生对象加入集合
			students.add(student);
		}
		for(Student s:students){
			System.out.println(s.getName()+"-----"+s.getNumber()+"------"+s.getAge());
		}

	}
}