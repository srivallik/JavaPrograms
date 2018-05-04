package javaInterviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {

		ArmstrongNumber a = new ArmstrongNumber();
		a.Armstrong(371);
		a.Armstrong(153);
		a.Armstrong(163);
	}
	public void Armstrong(int num) {
		int num1 = num;
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}
		if (sum == num1)
			System.out.println("Armstrong Number " + num1);
		else
			System.out.println("Not Armstrong Number " + num1);
	}

}
