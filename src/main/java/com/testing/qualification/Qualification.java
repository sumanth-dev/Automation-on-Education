package com.testing.qualification;

import org.openqa.selenium.WebDriver;

import com.testing.Util.Util;

public class Qualification {
	WebDriver driver = null;
	Util util = null;

	public Qualification(WebDriver driver) {
		this.driver = driver;
		this.util = new Util(this.driver);
	}

	public void navigate() throws Exception {
		String qualification = "//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//a[@href='#'][normalize-space()='Qualification']";
 
		
		util.mouseOverClick(qualification,
				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='LRN International GCSE']");

		util.mouseOverClick(
				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='LRN International GCSE']",
				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='LRN International AS and A Level']");

		// Pre A Foundation LEVEL 2//
//		util.mouseOverOverClick(
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//a[@href='#'][normalize-space()='Qualification']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14643']//a[@href='#'][normalize-space()='Pre A Foundation']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'Level 2')]");
//		// Pre U Foundation LEVEL 3//
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14567']//a[@href='#'][normalize-space()='Pre U Foundation']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14567']//a[contains(text(),'Level 3')]");
//		// ESOL for schools IESOL A1//
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[@href='#'][normalize-space()='IESOL']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[contains(text(),'A1')]");
//		// ESOL for schools IESOL A2//
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[@href='#'][normalize-space()='IESOL']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[contains(text(),'A2')]");
//
//		// ESOL for schools IESOL B1//
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[@href='#'][normalize-space()='IESOL']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[contains(text(),'B1')]");
//		// ESOL for schools IESOL B2//
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[@href='#'][normalize-space()='IESOL']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'B2')]");
//
//		// ESOL for schools IESOL C1//
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[@href='#'][normalize-space()='IESOL']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'C1')]");
//
//		// ESOL for schools IESOL C2//
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14576']//a[@href='#'][normalize-space()='IESOL']",
//				"");
//
//		// ESOL for schools Communication A1 //
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14592']//a[@href='#'][normalize-space()='Communication']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14592']//a[contains(text(),'A1')]");
//
//		// ESOL for schools Communication A2 //
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14592']//a[@href='#'][normalize-space()='Communication']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14592']//a[contains(text(),'A2')]");
//		// ESOL for schools Communication B1 //
//		util.mouseOverOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14575']//a[@href='#'][normalize-space()='ESOL For Schools']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14575']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14592']//a[@href='#'][normalize-space()='Communication']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14592']//a[contains(text(),'B1')]");
//		// Teaching English ELTAA //
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14619']//a[@href='#'][normalize-space()='Teaching English']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'ELTAA')]");
//
//		// Teaching English ELTAB //
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14619']//a[@href='#'][normalize-space()='Teaching English']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'ELTAB')]");
//
//		// Teaching English ELTAC //
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14619']//a[@href='#'][normalize-space()='Teaching English']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'ELTAC')]");
//
//		// Teaching English ELTAD //
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14619']//a[@href='#'][normalize-space()='Teaching English']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'ELTAD')]");
//
//		// General Teaching ETAB//
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14642']//a[@href='#'][normalize-space()='General Teaching']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'ETAB')]");
//
//		// General Teaching Level 3 Certificate//
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14642']//a[@href='#'][normalize-space()='General Teaching']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'Level 3 Certificate')]");
//
//		// General Teaching Level 5//
//		util.mouseOverOverClick(qualification,
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor menu-item-has-children menu-item-14384']//ul[@class='sub-menu']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14642']//a[@href='#'][normalize-space()='General Teaching']",
//				"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'Level 5')]");
	}

}
