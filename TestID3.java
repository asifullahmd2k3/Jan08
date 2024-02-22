package com.asif.SFDCLogin;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestID3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		WebElement rememberme = driver.findElement(By.id("rememberUn"));
		rememberme.click();
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(5000);
		WebElement usernav = driver.findElement(By.id("userNavLabel"));
		usernav.click();
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
		logout.click();
		
		Thread.sleep(5000);
		WebElement user1 = driver.findElement(By.id("idcard-identity"));
		String actual= user1.getText();
		System.out.println("text is extracted from username");
		if(actual.equals("asifullahmd2k3@asif.com"))
			System.out.println("test passed");
		else {
			System.out.println("test failed");
				
	
		
				
		
	}

	}
}

		
	
	


