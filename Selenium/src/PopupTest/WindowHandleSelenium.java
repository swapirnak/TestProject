package PopupTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleSelenium 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		WebElement click=driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		click.click();
		
		String	MainWindow=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> it=s1.iterator();
		
		String	childWindow=it.next();//childWindow
		
		driver.switchTo().window(childWindow);
		
		WebElement emailFiled=driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement submitBtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		
		emailFiled.sendKeys("Swapnil@g.com");
		submitBtn.click();
		driver.close();
		
		driver.switchTo().window(MainWindow);
		
		
		
		
	}
}
