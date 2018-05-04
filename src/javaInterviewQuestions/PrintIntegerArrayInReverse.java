package javaInterviewQuestions;

public class PrintIntegerArrayInReverse {

	public static void main(String[] args) {
		int inatarr[]=new int[5];
		inatarr[0]=5;
		inatarr[1]=4;
		inatarr[2]=3;
		inatarr[3]=2;
		inatarr[4]=1;
		System.out.println("I am ineteger array");
		for(int i=inatarr.length-1;i>=0;i--)
		{
			System.out.println(inatarr[i]);
		}

	}

}
