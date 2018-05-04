package Test;

public class MultiLevel {

	public static void main(String[] args) {
		cat c= new cat();
        c.eat();
        c.bark();
        c.meaw();
	}

}

class Animal {
	void eat()
	{
		System.out.println("Eating...!");
	}
}
class Dog extends Animal {
	void bark()
	{
		System.out.println("Barking...!");
	}
}
class cat extends Dog {
	void meaw()
	{
		System.out.println("Meaw...!");
	}
}