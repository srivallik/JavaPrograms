package Test;

import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		
	/*	int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		System.out.println("length of an array is: "+num.length);
		int len=num.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}*/
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in an array");
int ubound=sc.nextInt();
int ele[]=new int[ubound];
System.out.println("Elements in the array are");

for(int i=0;i<ubound;i++)
{
ele[i]=sc.nextInt();		
}
//System.out.println("length of an array is : "+ele.length);
System.out.println("Reverse order of an array is : ");
for(int i=ele.length-1;i>=0;i--)
{
	System.out.println(ele[i]);
}
	}
}
