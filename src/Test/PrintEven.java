package Test;

import java.util.Scanner;

public class PrintEven {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range for even numbers to print: ");
	int range=sc.nextInt();
	System.out.println("EvenNmbers from 1 to "+range);
		
	//EvenNumbersRange(10);
    	for(int i=0;i<=range;i++)
    	{
    		if(i%2==0)
    			System.out.println("Even numbers are : "+i);
    	}
	}
	public static void EvenNumbersRange(int num)
	{
		if(num%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Not an Even Number");
	}
}
