package com.asif.SFDCUsermenudropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC09 {

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
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		logOut.click();
		
		
	}

}
