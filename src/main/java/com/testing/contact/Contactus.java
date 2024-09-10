package com.testing.contact;

import org.openqa.selenium.WebDriver;

import com.testing.Util.Util;



public class Contactus {
	WebDriver driver =null;
	Util util=null;
	
public Contactus(WebDriver driver) {
	this.driver= driver;
	this.util=new Util(this.driver);

	
	}


public void navigate() {
String contactus="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-13734 last-menu-item']//a[normalize-space()='Contact us']";
 util.mouseOverClick(contactus, "//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-13734 last-menu-item']//a[normalize-space()='Contact us']");
// util.mouseOverClick(contactus, "//div[@class='elementor-element elementor-element-c6f58bd iconbox-text-center elementor-widget elementor-widget-thim-icon-box']//span[@class='icon']");
// util.mouseOverClick(contactus, "//div[@class='elementor-element elementor-element-a66d183 iconbox-text-center elementor-widget elementor-widget-thim-icon-box']//div[@class='smicon-box iconbox-top']");
// util.mouseOverClick(contactus, "//div[@class='elementor-element elementor-element-578317a iconbox-text-center elementor-widget elementor-widget-thim-icon-box']//span[@class='icon']");


 
	
}
}
