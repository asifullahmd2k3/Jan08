package com.asif.SFDCUsermenudropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06 {

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
		WebElement myProfile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		myProfile.click();
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		edit.click();
		driver.switchTo().frame("contactInfoContentId");
		WebElement about = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		about.click();
		WebElement lastName= driver.findElement(By.id("lastName"));
		lastName.clear();
		lastName.sendKeys("MoosaRaza");
		WebElement saveAll = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		saveAll.click();
		WebElement feed = driver.findElement(By.id("sfdc.ProfilePlatformFeed"));
		feed.click();
		//WebElement post = driver.findElement(By.id("publisherAttachTextPost"));
		//post.click();
		WebElement post = driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]"));
		post.click();
		
		
		//*[@id=//"cke_43_contain//"]iframe
		//cke_1_contents
		
		post.sendKeys("hello my friend");
		
		
		driver.switchTo().frame("frameborder");
		WebElement postText = driver.findElement(By.xpath("//body/p[text()='hello']\r\n"+ ""));
		postText.click();
		//*[@id="publishereditablearea"]
		
		//*driver.switchTo().frame("frameborder");
		
		//*post.sendKeys("HelloMyFriends");
		
		
	
		
	}

}
