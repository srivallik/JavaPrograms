package javaInterviewQuestions;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int arr[]=new int[6];
		arr[0]=9;
		arr[1]=7;
		arr[2]=56;
		arr[3]=90;
		arr[4]=32;
		arr[5]=23;
        int max=arr[0];
		for(int k=1;k<=arr.length-1;k++)
		{
			if(max<arr[k])
				{
					max=arr[k];
				}
		}
System.out.println(max);
	}

	private static int arr(int k) {
		// TODO Auto-generated method stub
		return 0;
	}

}
