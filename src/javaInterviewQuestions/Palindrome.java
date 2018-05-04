package javaInterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		p.Palindromes(141);
		p.Palindromes(321);
	}

	public void Palindromes(int num) {
		int num1 = num;
		int sum = 0;

		while (num > 0) {
			int r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;

		}
		if (num1 == sum)
			System.out.println("Palindrome " +num1);
		else
			System.out.println("Not Palindrome " +num1);
	}
}
