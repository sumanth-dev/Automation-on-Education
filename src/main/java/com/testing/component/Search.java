package com.testing.component;

import org.openqa.selenium.WebDriver;

import com.testing.Util.Util;

public class Search {
WebDriver driver =null;
Util util =null;
public  Search(WebDriver driver) {
	this.driver=driver;
	this.util=new Util(this.driver);
	
}
   public void navigate() {
	   String Search="//i[@class='tk tk-search']";
	   
	   util.mouseOverClick(Search, "//i[@class='tk tk-search']");
	   util.mouseOverClick(Search, "//a[normalize-space()='LRN Early Years (For 3 to 6 years old)']");
   }

	
	

}
