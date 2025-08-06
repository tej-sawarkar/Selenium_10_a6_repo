package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//step1: create fileinputstream object
	FileInputStream fis=new FileInputStream("./TestData/scriptdata.xlsx");
	
	//step2:create respective file type object
	Workbook wb = WorkbookFactory.create(fis);
	
	//steps3:call read methods
	String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
	
	String password = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(password);

	String email = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(email);
}
}
