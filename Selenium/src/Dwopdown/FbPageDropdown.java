package Dwopdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbPageDropdown {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
	
		WebElement emailField=driver.findElement(By.xpath("//input[@name='emailid']"));
		
		boolean isDisplay=emailField.isDisplayed();
		
		if(isDisplay==false)
		{
			emailField.click();
		}
		

	}

}
