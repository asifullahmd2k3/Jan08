package com.asif.SFDCContacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("asifullahmd2k3@asif.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Asif@0928");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(10000);
		WebElement contactsTab = driver.findElement(By.id("Contact_Tab"));
		contactsTab.click();
		WebElement contactsNew = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		contactsNew.click();
		WebElement lastName= driver.findElement(By.id("name_lastcon2"));
		lastName.sendKeys("Asifullah");
		WebElement acName= driver.findElement(By.id("con4"));
		acName.sendKeys("ABCD1234");
		WebElement contactsNewSave = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		contactsNewSave.click();
		
		System.out.println("Completed");
	}

}
