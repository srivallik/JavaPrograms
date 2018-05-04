package Test;

public class ConstructorOverloading {

	public static void main(String[] args) {
		Emp e=new Emp();
		Emp e1=new Emp(726511);
		Emp e2=new Emp(726511,47000.89);
        Emp e3=new Emp(726511,"Srivalli",28);
	}

}

class Emp{
	Emp()
	{
		System.out.println("Default const");
	}
	Emp(int id)
	{
		System.out.println("1 param const: " + id);
	}
	Emp(int id,double salary)
	{
		System.out.println("2 param const: " + id  + salary);
	}
	Emp(int id,String name,int age)
	{
		System.out.println("3 param const: " + id + name + age);
	}
}