package com.asif.SFDCCreateOpty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC19 {

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
		WebElement currentFQ = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[1]/td/select/option[1]"));
		currentFQ.click();
		WebElement allopty = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[1]/td/select/option[3]"));
		allopty.click();
		Thread.sleep(5000);
		WebElement nextFQ = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[1]/td/select/option[3]"));
		nextFQ.click();
		WebElement openopty = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[2]/td/select/option[2]"));
		openopty.click();

		
		
		
		
		
		System.out.println("Completed");
	}

}
