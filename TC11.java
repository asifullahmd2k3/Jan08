package com.asif.SFDCCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(3000);
		WebElement accountspage = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/nav/ul/li[5]/a"));
		accountspage.click();
		Thread.sleep(3000);
		WebElement createnewview = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
		createnewview.click();
		Thread.sleep(3000);
		WebElement viewname= driver.findElement(By.id("fname"));
		viewname.sendKeys("AmirK");
		WebElement viewuniquename= driver.findElement(By.id("devname"));
		viewuniquename.sendKeys("AmirK123");
		Thread.sleep(3000);
		WebElement savebutton = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
		savebutton.click();
				
	}

}
