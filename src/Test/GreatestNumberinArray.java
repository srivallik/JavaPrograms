package Test;

import java.util.Scanner;

public class GreatestNumberinArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the upperbound of an array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements in the array are: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Biggest number in an array is: ");
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
		if (max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
		}
}
