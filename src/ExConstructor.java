class Vehicle
{
	private int wheels;
	private String name;
	public Vehicle()
	{
	System.out.println("I am a constructor");
	}
	public Vehicle(int wheels)
	{
		this(2,"Access");	
		System.out.println("I am 2nd Constructor");
		this.wheels=wheels;
	}
	public Vehicle(int wheels,String name)
	{
		this();
		System.out.println("I am 3rd constructor");
		this.name=name;
	}
}
public class ExConstructor {

   public static void main(String[] args) {
   Vehicle v1=new Vehicle();
    //new Vehicle();
   Vehicle v2= new Vehicle(2);
   Vehicle v3=new Vehicle(2,"Activa");
    
	}

}
