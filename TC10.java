package com.asif.SFDCCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC10 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		
		Thread.sleep(5000);
		WebElement accountspage = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/nav/ul/li[5]/a"));
		accountspage.click();
		Thread.sleep(5000);
		WebElement newaccount = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
		newaccount.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		WebElement accountname= driver.findElement(By.id("acc2"));
		accountname.sendKeys("AmirKLLC");
		Thread.sleep(3000);
		WebElement accounttype = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select/option[7]"));
		accounttype.click();
		Thread.sleep(3000);
		WebElement customerpriority= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[7]/table/tbody/tr[1]/td[2]/span/select/option[2]"));
		customerpriority.click();	}	
	
}
