package 习题;

public class Student implements Comparable<Student> {
	private int number;
	private String name;
	private int age;
	public Student(int number,String name,int age) {
		this.name=name;
		this.number=number;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getNumber() {
		return this.number;
	}
	@Override
	public int compareTo(Student o) {
	      if (!(o instanceof Student))
	        throw new RuntimeException("不是Student对象");
	      Student p = (Student) o;
	      if (this.age > p.age)
	        return 1;
	      if (this.age == p.age)
	        return this.name.compareTo(p.name);
	      return -1;
	}
}
