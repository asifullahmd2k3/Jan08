package com.asif.SFDCUsermenudropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebElement usernav = driver.findElement(By.id("userNavLabel"));
		usernav.click();
		String actualTitle =driver.getTitle();
		String expectedTitle = "My Profile, My Settings, Developer Console, Switch to Lightning Experience, Logout";
		driver.findElement(By.id("userNavLabel")).click();
		Assert.assertEquals(expectedTitle,expectedTitle);
		 if (expectedTitle.equals(actualTitle)) {
			
		 System.out.println("testcase passed");
		 }
		 else {
		 System.out.println("testcase failed");
		
		
	}

}
}
