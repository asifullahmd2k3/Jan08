package com.asif.SFDCContacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC29 {

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
		//WebElement recentlyCreated = driver.findElement(By.xpath("//*[@id=\"hotlist_mode\"]/option[1]"));
		//recentlyCreated.click();
		//WebElement myContacts = driver.findElement(By.xpath("//*[@id=\"00BHr00000DyOtW_listSelect\"]/option[6]"));
		//myContacts.click();
		
		//WebElement allContacts = driver.findElement(By.id("fcf"));
		//Select se=new Select(allContacts);		
		//se.selectByIndex(5);
		Thread.sleep(5000);
		WebElement contactName = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
		contactName.click();
		
		
		System.out.println("Completed");
	}

}
