package printWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteAnyTypeOfData {

	private static final char[] obj = {'J','a','i'};

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("C:/Selenium/new.txt");
		pw.write("Hello print writer");
		pw.write(100);
		pw.println(200);
		pw.println(true);
		pw.println(14.58);
		char[] buf={'H','i'};
        pw.write(buf);
        pw.println(obj);
        pw.flush();
	}

}
