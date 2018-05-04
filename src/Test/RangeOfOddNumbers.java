package Test;

import java.util.Scanner;

public class RangeOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter l value: ");
		int l=sc.nextInt();
		System.out.println("Enter r value: ");
		int r=sc.nextInt();
		int c=0;
			
		for(int i=l;i<=r;i++)
		{
			if(i%2!=0)
		    {
				System.out.println(i);
				c=c+1;
		    }
		}
		System.out.println("Count of odd numbers between " +l +" and " +r +" are:"+c);
			}


}
