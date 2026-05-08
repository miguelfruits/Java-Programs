class Users{
	void login()
	{
		System.out.println("User loged in");
	}
}
class Student extends Users{
	String name = "Rohan";
	void getmarks()
	{
		System.out.println("All marks are printed");
	}
}
class Teacher extends Users{
	String name = "Amit";
	void getskill()
	{
		System.out.println("All skills are printed");
	}
}
public class HierarchicalExample{
	public static void main(String args[])
	{
		Teacher to = new Teacher();
		to.getskill();
		to.login();
		Student so = new Student();
		so.getmarks();
		so.login();
	}

}