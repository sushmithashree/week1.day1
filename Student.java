package week1day1;

public class Student {
	String name = "Sushmitha";
	int rollNo = 245;
	public void college(String name)
	{
		System.out.println(name);
	}
	private void deptName(String deptName)
	{
		System.out.println(deptName);
	}
	public static void main(String[]args)
	{
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.rollNo);
		student.college("Sri Krishna");
		student.deptName("ECE");
	}

}
