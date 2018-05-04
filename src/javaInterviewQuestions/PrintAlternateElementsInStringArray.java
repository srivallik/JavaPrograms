package javaInterviewQuestions;

public class PrintAlternateElementsInStringArray {

	public static void main(String[] args) {
		
		String str[]=new String[6];
		str[0]="A";
		str[1]="B";
		str[2]="C";
		str[3]="D";
		str[4]="E";
		str[5]="F";
		
		for(int i=0;i<=str.length-1;i++)
		{
			i=i+1;
			System.out.println(str[i]);
		}

	}

}
