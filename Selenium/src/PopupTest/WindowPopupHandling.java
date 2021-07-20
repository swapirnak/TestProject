package PopupTest;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandling {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String	baseString="http://demo.guru99.com/popup.php";
		
		driver.get(baseString);
		WebElement	link=driver.findElement(By.xpath("//a[text()='Click Here']"));
		link.click();
		
		
		java.util.Set<String> handler=driver.getWindowHandles();//It stores the all window IDs
		
		Iterator<String> it=handler.iterator();//Iterator obj for accessing Ids
		
		String parentWindowId=it.next();//accessing 1st window id
		
		System.out.println("Parent Window ID :: "+parentWindowId);
		
		String	childWindowId=it.next();
		
		System.out.println("Child Window Id :: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		WebElement emailField=driver.findElement(By.xpath("//input[@name='emailid']"));
		
		emailField.sendKeys("Swapnil");
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		
		

	}

}
