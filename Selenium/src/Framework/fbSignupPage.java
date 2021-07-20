package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class fbSignupPage extends baseClass
{

	public void fb_signup_page(String url,String actualSignupPageTitle,String fname,String lname,String str_email,String pwd,String day,String month,String year) throws InterruptedException 
	{
	
//driver.get("https://www.facebook.com/");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement	createNewAccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createNewAccount.click();
	
		//"Facebook – log in or sign up";
		String	expectedsinguPageTitle=driver.getTitle();
		System.out.println("Title :: "+expectedsinguPageTitle);
		
		if(actualSignupPageTitle.contentEquals(expectedsinguPageTitle))
		{
			System.out.println("Pass!!!You are on Singup Page");
		}
		else 
		{
			System.out.println("Failed");
		}
		
		//Thread.sleep(3000);

		WebElement fnamexpath =driver.findElement(By.xpath("//input[@name='firstname']"));
		fnamexpath.clear();
		fnamexpath.sendKeys(fname);
		WebElement lnamexpath=driver.findElement(By.xpath("//input[@name='lastname']"));
		lnamexpath.sendKeys(lname);
		
		
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.clear();
		email.sendKeys(str_email);
		WebElement re_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		re_email.clear();
		re_email.sendKeys(str_email);
		WebElement pwdxpath=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pwdxpath.clear();
		pwdxpath.sendKeys(pwd);
		
		Thread.sleep(3000);
		
		WebElement dayxpath=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1=new Select(dayxpath);
		//s1.deselectAll();
		s1.selectByValue(day);
		
		Thread.sleep(2000);
		
		WebElement monthxpath=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2=new Select(monthxpath);
		//s2.deselectAll();
		s2.selectByValue(month);
		Thread.sleep(2000);
		
		WebElement yearxpath=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3=new Select(yearxpath);
		//s3.deselectAll();
		s3.selectByValue(year);
		
		Thread.sleep(2000);
		
		WebElement gender=driver.findElement(By.xpath("//input[@value=2]"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement submit_buttn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit_buttn.click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
//		WebElement fname =driver.findElement(By.xpath("//input[@name='firstname']"));
//		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
//		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		WebElement re_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
//		WebElement pwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		WebElement gender=driver.findElement(By.xpath("//input[@value=2]"));
//		WebElement submit_buttn=driver.findElement(By.xpath("//button[@name='websubmit']"));
//		
//		
//		fname.sendKeys("Swapnil");
//		lname.sendKeys("Irnak");
//		String str_email="iamswapnilirnak@gmail.com";
//		email.sendKeys(str_email);
//		re_email.sendKeys(str_email);
//
//		Select s1=new Select(day);
//		//s1.deselectAll();
//		s1.selectByValue("12");
//		Thread.sleep(2000);
//		
//		Select s2=new Select(month);
//		//s2.deselectAll();
//		s2.selectByValue("11");
//		Thread.sleep(2000);
//		
//		Select s3=new Select(year);
//		//s3.deselectAll();
//		s3.selectByValue("1991");
//		Thread.sleep(2000);
//		
//		gender.click();
//		Thread.sleep(2000);
//		
//		submit_buttn.click();
//		
//		Thread.sleep(5000);
//		driver.close();
		
		
	}
	
}
