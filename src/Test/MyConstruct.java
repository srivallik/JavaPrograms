package Test;

public class MyConstruct {

	public static void main(String args[]){
		States obj=new States();
		States obj1=new States("Telugu");
		States obj3=new States();
		States obj4=new States("Hindhu","Chapathi");
		new States();
	//System.out.println("Hello World");	
		
	}
	
}
class States
{
States()
{
System.out.println("I am a default constructor");	
}
States(String language)
{
	System.out.println("2 nd constructor");
}
States(String worship,String food)
{
	System.out.println("3 rd constructor");
}
}
