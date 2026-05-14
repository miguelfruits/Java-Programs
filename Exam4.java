package src;

class Emp
{
	int id;
	String nm;
	int rating;
	
	Emp(int id,String nm,int rating)
	{
		this.id=id;
		this.nm=nm;
		this.rating=rating;
		
	}
	
	double Calcul(double sal)
	{
		if(rating >= 4) return sal*0.2;
		else if(rating >= 3) return sal*0.1;
		else return 0;
		
	}
	
}


class HR extends Emp
{
	HR(int id,String nm,int rating)
	{
		super(id,nm,rating);
		
	}
}

class Developer extends Emp
{
	Developer(int id,String nm,int rating)
	{
		super(id,nm,rating);
		
	}
}


public class Exam4 {
	public static void main(String[] args) {
		
		Emp e1=new HR(31,"Saad",4);
		Emp e2=new Developer(32,"Avej",5);
		
		System.out.println(e1.Calcul(45000.00));
		System.out.println(e2.Calcul(56000.00));
		

	}
}
