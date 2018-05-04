package javaInterviewQuestions;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int barr[]={10,64,89,19,40};
		int temp=0;
		int n=barr.length;
		for(int i=0;i<=barr.length-1;i++)
		{
			for(int j=i+1;j<barr.length;j++)
			{
				if(barr[i]>barr[j])
				{
					temp=barr[i];
					barr[i]=barr[j];
					barr[j]=temp;
				}
			}
			System.out.println(barr[i]);
		}
System.out.println("Second largest element::"+barr[n-2]);
	}


	}


