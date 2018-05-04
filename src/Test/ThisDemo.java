package Test;

public class ThisDemo {
int id;     // instance variable
String name;
ThisDemo(int id,String name) //local variable
{
	this.id=id;
	this.name=name;
}

void Display()
{
	System.out.println("id is: "+ id + " name is : "+ name);
}

public static void main(String[] args){
	ThisDemo t=new ThisDemo(10,"Rama");	
	ThisDemo t1=new ThisDemo(20,"Krishna");
	t.Display();
	t1.Display();
}


}

