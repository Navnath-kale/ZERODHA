package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	public static void main(String[] args) throws Throwable {
		
		// create object of file input stream
		
		FileInputStream file=new FileInputStream("E:\\Excel\\MAY7.xlsx");
		
		Thread.sleep(2000);
		
		// open excel sheet using create method
		
		String data = WorkbookFactory.create(file).getSheet("MAY7").getRow(1).getCell(1).getStringCellValue();
		
		Thread.sleep(2000);
		
		System.out.println(data);
	}

}
