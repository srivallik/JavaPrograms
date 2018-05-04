package fileConcept;

import java.io.File;

public class DisplayOnlyFileNames {

	public static void main(String[] args) {
		int count = 0;
		File f1 = new File("C:/Selenium");
		String[] s = f1.list();
		for (String s1 : s) {
			File f2 = new File(f1, s1);
			if (f2.isFile()) {
				System.out.println(s1);
				count++;
			}
		}
		System.out.println("count of files: " + count);

	}

}
