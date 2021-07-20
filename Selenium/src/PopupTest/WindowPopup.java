package PopupTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup 
{

	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement	tabButton=driver.findElement(By.xpath("//button[@id='tabButton']"));
		
		tabButton.click();
		
		Set<String>handler=driver.getWindowHandles(); //get all windows ID
		
		Iterator<String> it=handler.iterator();
		
		String	parentWindow=it.next();
		
		System.out.println("Parent window ID :: "+parentWindow);
		
		String	childWindow=it.next();
		
		System.out.println("Child window ID :: "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		String childWindowTitle=driver.getTitle();
		
		//driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		
		System.out.println("Title Of child window :: "+childWindowTitle);
		
		String actualChildWindowURL="https://demoqa.com/sample";
		String	childWindwoURL=driver.getCurrentUrl();
		
		System.out.println("URL :: "+childWindwoURL);
		if(actualChildWindowURL.contentEquals(childWindwoURL))
		{
			System.out.println("This is child window");
		}
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		String actualParentWindowURl="https://demoqa.com/browser-windows";
		String	parentWindowURl=driver.getCurrentUrl();
		System.out.println("Parent Window URL :: "+parentWindowURl);
		if(actualParentWindowURl.contentEquals(parentWindowURl))
		{
			System.out.println("Switch to Parent Window");
		}
		driver.close();
	}
}
