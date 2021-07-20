package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		

		File file=new File("C:\\Selenium\\Excel\\TestData.xlsx");
		
		
		FileInputStream inputstream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputstream);//workbook creare
		
		XSSFSheet sheet=wb.getSheet("GetData");//sheet name
		
		XSSFRow row1=sheet.getRow(1); //Row numbr
		
		XSSFCell cell1=row1.getCell(6); //cell number
		
		String url=cell1.getStringCellValue();
		
		System.out.println("URL ::"+url);
		
		
//		//XSSFRow row2=sheet.getRow(2);
//		XSSFCell cell2=row1.getCell(1);
//		String actualSignupPageTitle=cell2.getStringCellValue();
//		System.out.println("Actual string :: "+actualSignupPageTitle);

	}

}
