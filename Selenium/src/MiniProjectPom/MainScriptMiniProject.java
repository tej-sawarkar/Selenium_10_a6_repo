package MiniProjectPom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScriptMiniProject {
	public static void main(String[] args) throws IOException {
		//data fetch from properties file data driven
		FileInputStream file = new FileInputStream("./TestData/commondata.properties");
		Properties prop = new Properties();
		prop.load(file);
		String url = prop.getProperty("url");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		DataWelcomePageMini dwpm = new DataWelcomePageMini(driver);
		dwpm.getRegisterLink().click();
        //fect data from exel sheet
		FileInputStream fis = new FileInputStream("./TestData/MiniProjectDataRegister.xlsx");
	     //data store in ref var
		Workbook wb = WorkbookFactory.create(fis);
	
		String firstname = wb.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
        String lastname = wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
        String email = wb.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
        String password = wb.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
        String confirmPassword= wb.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
        
        //sending data to element from exel sheet using ref var
		RegisterPageElement rp = new RegisterPageElement(driver);
		rp.getFirstNameTextField().sendKeys(firstname);
		rp.getLastNameTextField().sendKeys(lastname);
		rp.getEmailTextField().sendKeys(email);
		rp.getPasswordTextField().sendKeys(password);
		rp.getConfirmPasswordTextField().sendKeys(confirmPassword);
	}
}
