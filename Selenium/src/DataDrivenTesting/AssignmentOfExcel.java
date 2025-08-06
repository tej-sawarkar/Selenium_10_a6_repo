package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AssignmentOfExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./TestData/facebookdata.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	wb.getSheet(null).getRow(0).getCell(0).getStringCellValue();
	
}
}
