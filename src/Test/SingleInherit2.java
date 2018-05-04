package Test;

public class SingleInherit2 {

	public static void main(String[] args) {
		NationalLanguage n = new NationalLanguage();
		n.Telugu();
		n.Hindi();

	}

}

class Language {

	void Telugu() {
		System.out.println("Telugu is my Mother tounge..!!!");
	}
}

class NationalLanguage extends Language {
	void Hindi() {
		System.out.println("Hindi is National language in India");
	}
}