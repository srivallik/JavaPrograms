package fileWriterConcept;

import java.io.FileWriter;
import java.io.IOException;

public class PassDataToTxtFIle {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:/Selenium/Chalo.txt");
		fw.write("Hello");
		fw.write(90);
		fw.write("\n");
		char[] ch = { 'k', 'a', 'r', 't', 'h', 'i' };
		fw.write(ch);
		fw.flush();
		fw.close();
	}

}
