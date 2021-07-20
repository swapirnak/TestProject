package Dwopdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownn {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		
		WebElement	Airlines=driver.findElement(By.xpath("//select[@name='airline']"));
		
		Select selectAirlines=new Select(Airlines);
		
		
		
		java.util.List<WebElement> AllOptions=selectAirlines.getOptions();
		
		for (WebElement airLinesWebElement : AllOptions) 
		{
			if(airLinesWebElement.getText().equals("Unified Airlines"))
					{
						airLinesWebElement.click();
					}
		}			
		
		
		
		
	}

}
