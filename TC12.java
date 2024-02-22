package com.asif.SFDCCreateAccount;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12 {

	public static void main(String[] args) throws InterruptedException {
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
		//*Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		//*Thread.sleep(5000);
		WebElement accountspage = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/nav/ul/li[5]/a"));
		accountspage.click();
		//*Thread.sleep(5000);
		WebElement viewpage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select/option[2]"));
		viewpage.click();
		//*Thread.sleep(5000);
		WebElement editview = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/div[1]/a[1]"));
		editview.click();
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("AmirKnewname");
		WebElement acname = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[2]/select/option[2]"));
		acname.click();
		WebElement operator = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[3]/select/option[4]"));
		operator.click();
		WebElement value = driver.findElement(By.id("fval1"));
		value.sendKeys("<a>");
		//*Thread.sleep(3000);
		WebElement savebutton = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
		savebutton.click();
}

	private static TimeUnit ofSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
