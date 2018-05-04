package Test;

public class MethodOverriding {

	public static void main(String[] args) {
		Sparrow sw=new Sparrow();
		Birds bi=new Birds();
        Birds b;
        b=sw;
        b.sound();
        b=bi;
        b.sound();
        
	}

}
class Birds {  // method overriding,late binding,dynamic binding,run
	              // time polymorphism
	void sound()
	{
		System.out.println("chukkkk...");
	}
}
class Sparrow extends Birds {
	void sound()
	{
		System.out.println("wwww....");
	}
}
