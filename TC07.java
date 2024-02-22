package com.asif.SFDCUsermenudropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07 {

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
		WebElement mySetting = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		mySetting.click();
		WebElement personal = driver.findElement(By.id("PersonalInfo"));
		personal.click();
		WebElement loginhist = driver.findElement(By.id("LoginHistory_font"));
		loginhist.click();
		//*WebElement dowloginhist = driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
		//*dowloginhist.click();
		WebElement displayAndLoyout = driver.findElement(By.id("DisplayAndLayout_font"));
		displayAndLoyout.click();
		WebElement customizeTab = driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]"));
		customizeTab.click();
		WebElement customApp = driver.findElement(By.id("p4"));
		Select se1=new Select(customApp);		
		se1.selectByIndex(8);
		WebElement availableTabs = driver.findElement(By.xpath("//*[contains(text(), 'Reports')]"));
		availableTabs.click();		
		WebElement add = driver.findElement(By.id("duel_select_0_right"));
		add.click();	
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		save.click();
		WebElement emailset = driver.findElement(By.id("EmailSetup"));
		emailset.click();
		WebElement myEmail = driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]"));
		myEmail.click();
		WebElement emailname= driver.findElement(By.id("sender_name"));
		emailname.clear();
		emailname.sendKeys("asif");
		WebElement emailadd= driver.findElement(By.id("sender_email"));
		emailadd.clear();
		emailadd.sendKeys("abcd123@asif.com");
		WebElement saveemail= driver.findElement(By.xpath("	//*[@id=\"bottomButtonRow\"]/input[1]"));
		saveemail.click();
		WebElement calandrem = driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders\"]/a"));
		calandrem.click();
		
		frameborder
	}

}
