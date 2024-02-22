package com.asif.SFDCCreateAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC14 {

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
		
		WebElement account = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/nav/ul/li[8]/a"));
		account.click();
		WebElement lastActivity = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		lastActivity.click();
		WebElement down = driver.findElement(By.id("ext-gen148"));
		down.click();
		WebElement creatDate = driver.findElement(By.xpath("/html/body/div[15]/div/div[3]"));
		creatDate.click();
		
		WebElement from = driver.findElement(By.id("ext-gen152"));
		from.click();
		WebElement fromToday = driver.findElement(By.id("ext-gen281"));
		fromToday.click();
		
		WebElement to = driver.findElement(By.id("ext-gen154"));
		to.click();
		WebElement toToday = driver.findElement(By.id("ext-gen296"));
		toToday.click();
		
		WebElement save = driver.findElement(By.id("ext-gen49"));
		save.click();
		
		
		//*driver.switchTo().alert().sendKeys("TodayReport2/14/2024");
		
		
		WebElement reportName = driver.findElement(By.id("saveReportDlg_reportNameField"));
		reportName.sendKeys("TodayReport2/14/2024");
		//*WebElement reportUniqueName = driver.findElement(By.id("saveReportDlg_DeveloperName"));
		//*reportUniqueName.clear();
		//*reportUniqueName.sendKeys("TodayReport2_14_2024");
		
			
		WebElement saveRun = driver.findElement(By.id("ext-gen316"));
		saveRun.click();
		
		 
		
		
	}

}
