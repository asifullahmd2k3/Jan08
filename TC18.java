package com.asif.SFDCCreateOpty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC18 {

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
		WebElement optyStuck = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		optyStuck.click();
		
		System.out.println("Completed");
	}

}
