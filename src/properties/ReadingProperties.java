package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties p=new Properties();  //path dependent
		String path="C:\\Users\\Srivalli K\\workspace\\JavaProgram\\src\\properties\\project.properties";
		FileInputStream fs=new FileInputStream(path);
		p.load(fs);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("NextId"));
		
		

	}

}
