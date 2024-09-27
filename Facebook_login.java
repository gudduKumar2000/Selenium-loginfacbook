package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
          Thread.sleep(2000);
       driver.get("https://www.facebook.com/");
       Thread.sleep(2000);
      WebElement ele= driver.findElement(By.xpath("//input[@name='email']"));
     	Thread.sleep(2000);
     	ele.sendKeys("UserName");
     	Thread.sleep(2000);
     	ele.sendKeys(Keys.TAB+"pwd",Keys.ENTER);        insteed of This //WebElement ele2= driver.findElement(By.xpath("//input[@name='pass']"));
                                                                      	 // ele.sendKeys("Guddu@123");
     		                                                           //ele.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
     	
}
}
