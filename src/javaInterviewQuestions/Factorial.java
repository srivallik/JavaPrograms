package javaInterviewQuestions;

public class Factorial {

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		f1.Factorial(4);
		f1.Factorial(6);
		f1.Factorial(9);

	}
    public void Factorial(int n)
    {   int fact=1;
    	for(int i=1;i<=n;i++)
    	{
    		fact=fact*i;
    	}
    	System.out.println("Factorial of a number "+ n +" is: "+fact); 	
    }
}
