package com.testing.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	WebDriver driver =null;
	
	public  Util(WebDriver driver) {
		this.driver=driver;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
	public void mouseOverClick(String pXpath, String xpath ) {

		
		
		WebElement ele = driver.findElement(By.xpath(pXpath));
		
		Actions action = new Actions(driver);

		action.moveToElement(ele).perform();	
		
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void mouseOverOverClick(String cXpath, String pXpath, String xpath) {
		
		//WebElement ele = driver.findElement(By.xpath(cXpath));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
 
		Actions action = new Actions(driver);
 
		action.moveToElement((WebElement) wait).perform();
 
		mouseOverClick(pXpath, xpath);
	
		
	}
	public void mouseOverOverOverClick(String qualification, String qualification2, String qualification3,
			String qualification4) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
 
		Actions action = new Actions(driver);
 
		action.moveToElement((WebElement) wait).perform();
 
		mouseOverClick(qualification2, qualification3);
	
		
	}	
	}
	

