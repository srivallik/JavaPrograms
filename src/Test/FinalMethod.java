package Test;

public class FinalMethod {
    final void Run()
    {
    	System.out.println("Running...!!");
    }
   /* void Run()
    {
    	System.out.println(I am Running..!!);
    }*/
	public static void main(String[] args) {
		FinalMethod f=new FinalMethod();
		f.Run();

	}

}
