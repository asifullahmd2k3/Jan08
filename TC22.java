package com.asif.SFDCLeads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC22 {

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
		WebElement lead = driver.findElement(By.id("Lead_Tab"));
		lead.click();
		Thread.sleep(5000);
		WebElement myUnreadleadmain = driver.findElement(By.id("fcf"));
		myUnreadleadmain.click();
		Thread.sleep(5000);
		WebElement myUnreadlead = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select/option[2]"));
		myUnreadlead.click();
		
		Thread.sleep(3000);
		WebElement navLabel = driver.findElement(By.id("userNavLabel"));
		navLabel.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
		logout.click();
		Thread.sleep(3000);
		driver.get("https://login.salesforce.com/");
		WebElement username1= driver.findElement(By.id("username"));
		username1.sendKeys("asifullahmd2k3@asif.com");
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("Asif@0928");
		WebElement login1 = driver.findElement(By.id("Login"));
		login1.click();
		Thread.sleep(3000);
		WebElement lead1 = driver.findElement(By.id("Lead_Tab"));
		lead1.click();
		WebElement myUnreadleadGo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		myUnreadleadGo.click();
		
		System.out.println("Completed");
		
	}

}
