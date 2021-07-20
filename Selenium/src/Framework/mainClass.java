package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mainClass extends baseClass {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		fbSignupPage fb=new fbSignupPage();
		
		
		ExcelDataFile ex=new ExcelDataFile();
		
		
		
		fb.fb_signup_page(exurlfromexcel, actualSignupPageTitlefromexcel, fnamefromexcel, lnamefromexcel, str_emailfromexcel, pwdfromexcel, dayfromexcel, monthfromexcel, yearfromexcel);
		
//		fb.fb_signup_page("https://www.facebook.com/","Facebook – log in or sign up",
//				"Nitin","Jadhav","Nj@gmail.com","Nitin123","30","12","1991");
//		
		
		
//		File file=new File("C:\\Selenium\\Excel\\TestData.xlsx");
//		FileInputStream inputstream=new FileInputStream(file);
//		XSSFWorkbook wb=new XSSFWorkbook(inputstream);//workbook create
//		XSSFSheet sheet=wb.getSheet("GetData");//sheet name
//		XSSFRow row=sheet.getRow(1); //Row number
//		XSSFCell url=row.getCell(0);//get proper cell
//		String urlfromexcel=url.getStringCellValue();
//		XSSFCell actualSignupPageTitle=row.getCell(1);
//		String actualSignupPageTitlefromexcel=actualSignupPageTitle.getStringCellValue();
//		XSSFCell fname=row.getCell(2);
//		String fnamefromexcel=fname.getStringCellValue();
//		XSSFCell lname=row.getCell(3);
//		String lnamefromexcel=lname.getStringCellValue();
//		XSSFCell str_email=row.getCell(4);
//		String str_emailfromexcel=str_email.getStringCellValue();
//		XSSFCell pwd=row.getCell(5);
//		String pwdfromexcel=pwd.getStringCellValue();
//		XSSFCell day=row.getCell(6);
//		String dayfromexcel=day.getStringCellValue();
//		System.out.println("Date Select ::"+dayfromexcel);
//		
//		XSSFCell month=row.getCell(7);
//		String monthfromexcel=month.getStringCellValue();
//		
//		XSSFCell year=row.getCell(8);
//		String yearfromexcel=year.getStringCellValue();
		
//		fb.fb_signup_page(urlfromexcel, actualSignupPageTitlefromexcel, fnamefromexcel, lnamefromexcel, str_emailfromexcel, pwdfromexcel, dayfromexcel, monthfromexcel, yearfromexcel);

	}

}
