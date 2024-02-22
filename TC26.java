package com.asif.SFDCContacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC26 {

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
		WebElement creatNewView = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		creatNewView.click();
		WebElement viewName = driver.findElement(By.id("fname"));
		viewName.sendKeys("ARIF");
		WebElement viewUniqueName = driver.findElement(By.id("devname"));
		viewUniqueName.sendKeys("ARIF1234");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
		save.click();
		
		System.out.println("Completed");
		
		
		
		
		
		
		
		
	}

}
