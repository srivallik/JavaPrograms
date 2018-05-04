package Test;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ubound of string array");
        int n=sc.nextInt();
		System.out.println("Enter the elements in array: ");
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("Reverse order of an array :");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		System.out.println("Printing the alternate elements of an array: ");
		for(int j=0;j<=str.length-1;j+=2)
		{
				System.out.println(str[j]);
		}
		
		

	}

}
