package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelWithDateAndStatus {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./TestData/dateExel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	double price = wb.getSheet("sheet1").getRow(1).getCell(3).getNumericCellValue();
	System.out.println(price);
	
	boolean status = wb.getSheet("sheet1").getRow(1).getCell(4).getBooleanCellValue();
	System.out.println(status);
	
	LocalDateTime date = wb.getSheet("sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
	System.out.println(date);
	
}
}
