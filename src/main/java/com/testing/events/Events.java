package com.testing.events;

import org.openqa.selenium.WebDriver;

import com.testing.Util.Util;

public class Events {
	WebDriver driver =null;
	Util util=null;
	public   Events(WebDriver driver) {
		this.driver= driver;
		this.util=new Util(this.driver);

}
	
	public void navigate() {
		String events= "//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Events']";

		util.mouseOverClick(events,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Events']");
		util.mouseOverClick(events,"//a[normalize-space()='Happening']");
		util.mouseOverClick(events,"//a[normalize-space()='Upcoming']");
		util.mouseOverClick(events,"//a[normalize-space()='Expired']");
	}
}
