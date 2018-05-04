package Test;

import java.util.Scanner;

public class SmallestNumberInanArray {

	public static void main(String[] args) {
		System.out.println("Enter the ubound of an array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
		

	}

}
