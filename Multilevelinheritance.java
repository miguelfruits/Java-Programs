class Company{
	void gettotalemployee()
	{
		System.out.println("Total Employees are 1000");
	}
}
class Countrybranch extends Company{
	void totalempincountry()
	{
		System.out.println("Total Employees are 500");
	}
}
class Localbranch extends Countrybranch{
	void totallocalemp()
	{
		System.out.println("Total Employees are 100");
	}
}
public class Multilevelinheritance{
	public static void main(String args[])
	{
	 Localbranch lb = new Localbranch();
	 lb.totallocalemp();
	 lb.totalempincountry();
	 lb.gettotalemployee();
	}

}