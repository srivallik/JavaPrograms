package Test;

public class SingleInherit {

	public static void main(String[] args) {
		Substraction c=new Substraction();
		c.x=5;
		c.y=1;
		c.Sub();
		c.Add();

	}

}

class Calculation {
	int x,y,result;
	
	void Add()
	{
		result=x+y;
		System.out.println("addition od two numbers is:"+ result);
	}
}
class Substraction extends Calculation {

	void Sub()
	{
		result=x-y;
		System.out.println("substraction of two numbers is:"+ result);
	}
}
