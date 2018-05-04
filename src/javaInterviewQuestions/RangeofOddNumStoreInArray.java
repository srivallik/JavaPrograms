package javaInterviewQuestions;

public class RangeofOddNumStoreInArray {
	public static void main(String[] args) {
		RangeofOddNumStoreInArray ra = new RangeofOddNumStoreInArray();
		ra.printOddNumbers(0, 40);
	}
	public void printOddNumbers(int first, int last) {
		int countOfOdd = (last - first) / 2;
		System.out.println("count of odd numbers: " + countOfOdd);
		int storeOddNum[] = new int[countOfOdd];
		System.out.println("length of storeoddnum[] :: " + storeOddNum.length);

		for (int i =1; first< last; i++) {
					if ((i % 2) != 0) {
					storeOddNum[first] = i;
					System.out.println(storeOddNum[first]);
					first=first+1;
				}
			}
		}

	

}
