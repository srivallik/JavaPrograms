package interfaces;

public class ClassC implements InterfaceA,InterfaceB{

	@Override
	public void methodB() {
		System.out.println("in method B");
		
	}

	@Override
	public void methodA() {
		System.out.println("in method A");
		
	}

	@Override
	public void newMethod() {
		System.out.println("new method");
	}

	public void ClassCMethod()
	{
		System.out.println("Class C method");
	}
}
