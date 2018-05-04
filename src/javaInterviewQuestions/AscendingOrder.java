package javaInterviewQuestions;

public class AscendingOrder {

	public static void main(String[] args) {
		int arr[] = { 76, 34, 13, 9, 54, 90 };
		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
