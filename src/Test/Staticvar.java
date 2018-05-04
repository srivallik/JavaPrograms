package Test;

public class Staticvar {

	public static void main(String[] args) {
		Super s = new Super();
		Super s1 = new Super();
		Super s2 = new Super();

	}

}
class Super {
	static int i = 5;

	Super() {
		i++;
		System.out.println(i);
	}
}