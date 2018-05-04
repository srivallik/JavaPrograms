package inheritance;

public class Test {

	public static void main(String[] args) {
		ClassA a=new ClassA();
		System.out.println(a.x);
		//System.out.println(a.y); //parent class cannot access child class properties
		a.methA();
		//a.methB();
		ClassB b=new ClassB();
		System.out.println(b.x);
		System.out.println(b.y);
		b.methA();
		b.methB();

	}

}
