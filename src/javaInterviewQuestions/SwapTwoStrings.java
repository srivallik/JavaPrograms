package javaInterviewQuestions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println("Before swapping");
		System.out.println("a val is::"+a);
		System.out.println("b val is::"+b);
		System.out.println("After swapping");
		a=a+b; //HelloWorld
		b=a.substring(0,a.length()-b.length());  //Hello
		a=a.substring(b.length());
		System.out.println("a val is::"+a);
		System.out.println("b val is::"+b);

	}

}
