package Test;

public class MethodOverriding2 {
  public static void main(String[] args) {
	 Monkey m=new Monkey();
	 Donkey d=new Donkey();
	 Monkey obj;
	 obj=m;
	 obj.sound();
	 obj=d;
	 obj.sound();
  }
}

class Monkey {
	void sound()
	{
		System.out.println("Awwwww....");
	}
}
class Donkey extends Monkey {
	void sound()
	{
		System.out.println("Koppppppp...");
	}
}
