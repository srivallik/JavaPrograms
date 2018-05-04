package properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingXLS {

	//https://poi.apache.org/spreadsheet/quick-guide.html
	//HSSFWorkbook-->xls files
	//XSSFWorkbook-->xlsx files
	public static void main(String[] args) throws IOException {
		Workbook ws=new XSSFWorkbook();
		FileOutputStream fsout=new FileOutputStream("C:/Selenium/workbook.xlsx");
		ws.write(fsout);
		Sheet sheet1=ws.createSheet("firstsheet");
		Sheet sheet2=ws.createSheet("secondsheet");
		System.out.println(" sheets created");
		fsout.close();

	}

}
