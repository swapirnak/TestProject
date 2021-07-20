package Dwopdown;

import java.awt.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class DropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement SelectOption=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(SelectOption);
		
		java.util.List<WebElement> AllOptions=select.getOptions();
		
		int size=AllOptions.size();
		
		System.out.println(size);
		
		for (WebElement SelectElement : AllOptions) 
		{
			//System.out.println(SelectElement.getText());
			
			if(SelectElement.getText().equals("WESTERN SAMOA"))
			{
				SelectElement.click();
				
			}
		}
		
		System.out.println("------------------------------------------------");
		
//		for(int i=0;i<AllOptions.size();i++)
//		{
//			String AllText=AllOptions.get(i).getText();
//			
//			System.out.println(AllText);
//			
//			
//		}
		
		
		
		
	}

}
