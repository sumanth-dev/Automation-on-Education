import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Combo {
WebDriver driver = null;
public Combo(WebDriver driver) {
	this.driver=driver;
}
public void navigate() {
	WebElement ele = driver.findElement(By.xpath("//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'About us')]"));


	Actions action = new Actions(driver);

	action.moveToElement(ele).perform();
	 
	driver.findElement(By.xpath("//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'Who we are')]")).click();
	 
	WebElement ele2 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='International Offices']"));


	Actions action2 = new Actions(driver);

	action.moveToElement(ele).perform();
	 
	driver.findElement(By.xpath("//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Education Committee']")).click();
}
}
