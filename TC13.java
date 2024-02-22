package com.asif.SFDCCreateAccount;

import java.util.concurrent.TimeUnit;

import org.openga.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC13 {

	private static Object alert_text;

	public static void main(String[] args) {
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
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebElement accountspage = driver.findElement(By.id("Account_Tab"));
		accountspage.click();
		WebElement mergeaccount = driver.findElement(By.xpath("//a[@href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']"));
		mergeaccount.click();
		WebElement findaccount= driver.findElement(By.id("srch"));
		findaccount.sendKeys("Salman");
		WebElement findac = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/input[2]"));
		findac.click();
		WebElement next = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[5]/div/input[1]"));
		next.click();
		
		WebElement merge = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[5]/div/input[2]"));
		merge.click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
		String alertMessage1= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
	}

	private static Object Alert(FirefoxDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
