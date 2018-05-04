package Test;

public class Inherit {

	public static void main(String[] args) {
		A a1=new A(5);
		B b1=new B();
		B b2=new B(4);
		

	}

}

class A {
	public A()
	{
		System.out.println("I am super class default constructor");
	}
	public A(int a)
	{
		System.out.println("I am super class 1 param constructor");
	}
}
class B extends A{
	public B()
	{
		System.out.println("I am base class default constructor");
	}
	public B(int b)
	{
		System.out.println("I am base class 1 param constructor");
	}
}
