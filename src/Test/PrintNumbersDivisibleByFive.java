package Test;

import java.util.Scanner;

public class PrintNumbersDivisibleByFive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int limit=sc.nextInt();
        System.out.println("List of numbers divisible by 5 are: ");
        
        for(int j=0;j<=limit;j++)
        {
        	if(j%5==0)
        	System.out.println(j);
        }
	}

}
