package com.asif.SFDCCreateOpty;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CT16 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(5000);
		WebElement optyTab = driver.findElement(By.id("Opportunity_Tab"));
		optyTab.click();	
		WebElement newTab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		newTab.click();
		WebElement optyName= driver.findElement(By.id("opp3"));
		optyName.sendKeys("NewNameSalman");
		WebElement accountName= driver.findElement(By.id("opp4"));
		accountName.sendKeys("Salman12");
		//Thread.sleep(5000);
		//WebElement accountNamesearch= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/table/tbody/tr[4]/td[5]"));
		//accountNamesearch.click();
		
		//Thread.sleep(5000);
		//String parentWindow = driver.getWindowHandle();
		//System.out.println("parent window handle="+parentWindow);
		//Set<String> listOfHandles=driver.getWindowHandles();
		//System.out.println("total window opened currently="+listOfHandles.size());
		//for(String handle: listOfHandles)
		{
			//System.out.println("current active window handle: "+handle);
			//if(!handle.equals(parentWindow)) {
			//driver.switchTo().window(handle);
			//String url =driver.getCurrentUrl();
			//String title=driver.getTitle();
			//System.out.println("url="+url+" and title="+title);
			//driver.findElement(By.className("dataCell")).click(); 
			
		}
		
				
		//driver.switchTo().window(parentWindow);
		//String url=driver.getCurrentUrl();
		//String title=driver.getTitle();
		//System.out.println("url="+url+" and title="+title);
		//driver.quit();
		
		
		WebElement closeDate= driver.findElement(By.id("opp9"));
		closeDate.click();
		driver.findElement(By.id("datePickerCalendar")).click();
		//driver.findElement(By.id("calToday")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();
		
		//driver.findElement(By.linkText("Next")).click(); //click next month
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/table/tbody/tr[5]/td[4]")).click(); 
		//WebElement closeDateToday= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/table/tbody/tr[4]/td[5]"));
		//closeDateToday.click();
		
				
		WebElement stagedropdown = driver.findElement(By.id("opp11"));
		Select se=new Select(stagedropdown);		
		se.selectByIndex(3);
		WebElement probability  = driver.findElement(By.id("opp12"));
		probability.clear();
		probability.sendKeys("50");
		Thread.sleep(5000);
		//WebElement leaddropdown = driver.findElement(By.id("opp6"));
		//Select se1=new Select(leaddropdown);
		Thread.sleep(5000);
		//se.selectByIndex(4);
		WebElement lead= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select/option[4]"));
		lead.click();
		WebElement primaryCampaignSource= driver.findElement(By.id("opp17"));
		primaryCampaignSource.sendKeys("ABCD");
		WebElement save= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		save.click();
		
	
		
				
		System.out.println("Completed");
		}
	

	private static Object WebDriverWait(FirefoxDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
