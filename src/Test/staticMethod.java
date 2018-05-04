package Test;

public class staticMethod {
	static void Run() {
		System.out.println("Running...!!");
	}

	void Walk() {
		System.out.println("Walking..!!");
	}
	
	public static void main(String[] args) {
		staticMethod.Run();
		staticMethod s = new staticMethod();
		s.Walk();
	}
}
