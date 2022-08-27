package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Adress {
	public static void main(String[] args) throws Throwable {
		
		// create object of FIS
		
		FileInputStream file=new FileInputStream("E:\\Excel\\Adress.xlsx");
		
		// Open the Excel sheeet
		
		String data = WorkbookFactory.create(file).getSheet("Adress").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		// Print the data
		
		FileInputStream file1=new FileInputStream("E:\\Excel\\Adress.xlsx");
		
		
		String data1 = WorkbookFactory.create(file1).getSheet("Adress").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data1);
		
		
		// Print the data
		
		FileInputStream file2=new FileInputStream("E:\\Excel\\Adress.xlsx");
		
         String data2 = WorkbookFactory.create(file2).getSheet("Adress").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(data2);
		
		
		// Print the Advantages 1
		
		FileInputStream file3=new FileInputStream("E:\\Excel\\Adress.xlsx");
		
        String data3 = WorkbookFactory.create(file3).getSheet("Adress").getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(data3);
		
		
		// Print the Advantages 2
		
        FileInputStream file4=new FileInputStream("E:\\Excel\\Adress.xlsx");
		
        String data4 = WorkbookFactory.create(file4).getSheet("Adress").getRow(4).getCell(0).getStringCellValue();
		
		System.out.println(data4);
		
		
		 // Print the Advantages 3
		
        FileInputStream file5=new FileInputStream("E:\\Excel\\Adress.xlsx");
		
        String data5 = WorkbookFactory.create(file5).getSheet("Adress").getRow(5).getCell(0).getStringCellValue();
		
		System.out.println(data5);
		
		 // Print the Advantages 4
		
		 FileInputStream file6=new FileInputStream("E:\\Excel\\Adress.xlsx");
			
	     String data6 = WorkbookFactory.create(file6).getSheet("Adress").getRow(6).getCell(0).getStringCellValue();
			
		 System.out.println(data6);
		
		
		
		
		
		
	}

}
