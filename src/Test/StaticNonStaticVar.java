package Test;

public class StaticNonStaticVar {


	static int count=0; //class var will get memory only once ,during loading of class and it will retain new incremented value
	int increment; // instance var will get memory for every object creation,even though it is incremented it wont copy the value
	StaticNonStaticVar()
	{
		count++;
		System.out.println(count);
	}
	
	StaticNonStaticVar(int increment)
	{
		increment++;
		System.out.println(increment);
	}

	
	  public static void main(String args[])
	  {
		  StaticNonStaticVar c=new StaticNonStaticVar();
		  StaticNonStaticVar c1=new StaticNonStaticVar();
		  StaticNonStaticVar c2=new StaticNonStaticVar();
		  StaticNonStaticVar c3=new StaticNonStaticVar(1);
		  StaticNonStaticVar c4=new StaticNonStaticVar(1);
	  }
	}

