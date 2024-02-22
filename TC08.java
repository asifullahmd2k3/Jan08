package com.asif.SFDCUsermenudropdown;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC08 {

	private static final String handle = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		//*Thread.sleep(5000);
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		//*Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		//*Thread.sleep(3000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebElement usernav = driver.findElement(By.id("userNavLabel"));
		usernav.click();
		WebElement devConsole = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		devConsole.click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window handle="+parentWindow);
		Set<String> listOfHandles=driver.getWindowHandles();
		System.out.println("Total Window opened currently="+listOfHandles);
		
		
		System.out.println("current active window handle: "+handle);
		if(!handle.equals(parentWindow)) {
		driver.switchTo().window(handle);   // switching to the new window
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("url="+url+" and title="+title);
		
		driver.switchTo().window(parentWindow);   // switching to the parent window
		String url1=driver.getCurrentUrl();
		String title1=driver.getTitle();
		System.out.println("url="+url1+" and title="+title1);
			
		driver.quit(); // closes all the window opned
		//driver.close();// it close only current window
		}
	}

}
