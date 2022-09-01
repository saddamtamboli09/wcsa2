package Readdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	 FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	 Workbook wb = WorkbookFactory.create(fis); // make file ready to read operation
	 Sheet sh = wb.getSheet("Citytour"); // go to the specified row
	 Row row = sh.getRow(3);  // go to specified column
	 Cell cell = row.getCell(0);
	 String data = cell.getStringCellValue(); // get the data from cell
	 System.out.println(data);  //print the data
	}
	
}

	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
