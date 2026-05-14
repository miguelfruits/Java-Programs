package src;

class Person
{
	int id;
	String nm;
}

class Employee extends Person
{
	double bs;
	
}

class Teaching extends Employee
{
	double ra;
	
	double calcu()
	{
		return bs+0.20+0.10+ra;
	}
}


public class Exam3 {
	public static void main(String[] args) {
		
		Teaching t1=new Teaching();
		
		System.out.println(t1.id=31);
		
		System.out.println(t1.nm="Saad");
		t1.bs=26.23;
		t1.ra=65.23;
		System.out.println("Gross Salary : " +t1.calcu());
		

	}
}
