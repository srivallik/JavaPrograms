package objectAndConstructors;

public class Constructors {
//COnstructor is something which initializes your object
	public static void main(String[] args) {
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.model="Swift";
		a.price=2345;
		
		Car d=new Car("Punto",23906);
		System.out.println(d.model);
		System.out.println(d.price); 
		
		Car e=new Car("Audi",90234);
		System.out.println(e.model);
		
		

	}

}
