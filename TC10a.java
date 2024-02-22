package com.asif.SFDCCreateAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC10a {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		//*Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		WebElement alltab = driver.findElement(By.xpath("//img[@src='/img/s.gif' and @alt='All Tabs' and @class='allTabsArrow' and @title='All Tabs']"));
		alltab.click();
	
		WebElement custmytab = driver.findElement(By.xpath("//input[@title='Customize My Tabs']"));
		custmytab.click();
		
		WebElement AvlTabs = driver.findElement(By.id("duel_select_0"));
		Select tabs=new Select(AvlTabs);		
		tabs.selectByIndex(0);
		WebElement rightarrow = driver.findElement(By.xpath("//img[@src='/img/s.gif' and @alt='Add' and @class='rightArrowIcon' and @title='Add']\r\n"));
		rightarrow.click();
		WebElement save = driver.findElement(By.xpath("//input[@value=' Save ' and @class='btn primary' and @name='save' and @title='Save' and @type='submit']"));
		save.click();
		
		System.out.println("Completed");
		
}
}
