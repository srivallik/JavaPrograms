package javaInterviewQuestions;

import java.awt.Point;

public class PassByReference {
	int x;
	int y;

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		System.out.println(p.x + "----" + p.y);
		Swap(p.x, p.y);
		System.out.println(p.x + "----" + p.y);
		SwapValues(p);
		System.out.println(p.x + "------" + p.y);
	}

	public static void Swap(int a, int b) // Pass by value
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	public static void SwapValues(Point t) // Pass by reference
	{
		int temp = t.x;
		t.x = t.y;
		t.y = temp;

	}

}
