public class Test3{
	public static void main(String[] args) {
		Employee myobj=new Employee(); // obj creation,name should be same as class name.Memory is allocated during run time only.
		myobj.Display(726511,"srivalli");
	}
}

class Employee {
	int e;  //instance variables
	String n;
	
void Display(final int empno,final String name)
{
	int localvar1;
	int localvar2;
	System.out.println("I am a local variable,declared inside a method and my scope is within the method only"+" "+"localvar1");
	System.out.println("I am a local variable,declared inside a method and my scope is within the method only"+" "+"localvar2");
	//System.out.println(empno+" "+name);
	e=empno;
	n=name;
	System.out.println(e+" "+n);
}
}