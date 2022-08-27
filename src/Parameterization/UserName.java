package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UserName {
	public static void main(String[] args) throws Throwable {
		
		// create the object of file input Stream
		
		FileInputStream file=new FileInputStream("E:\\Excel\\IMP.xlsx");
		
		// open Username using create method
		
		String data = WorkbookFactory.create(file).getSheet("IMP").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		Thread.sleep(2000);
		
		FileInputStream file1=new FileInputStream("E:\\Excel\\IMP.xlsx");
		
		// Open Password Using Create Method
		
		String data1 = WorkbookFactory.create(file1).getSheet("IMP").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data1);
	}

}
