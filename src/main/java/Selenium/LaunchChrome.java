
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testing.component.Aboutus;
import com.testing.component.Search;
import com.testing.contact.Contactus;
import com.testing.events.Events;
import com.testing.news.News;
import com.testing.qualification.Qualification;




public class LaunchChrome {
	
public static void main(String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jalag\\OneDrive\\Desktop\\sumanth\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.lrnschools.org/");
	driver.manage().window().maximize();
	
	Aboutus Aboutus = new Aboutus(driver);
    Aboutus.navigate();
	
	Qualification Qualification = new Qualification(driver);
	Qualification.navigate();
	
	News News = new News(driver);
	News.navigate();

	Events events = new Events(driver);
	events.navigate();	
  
	Contactus Contactus = new Contactus(driver);
	Contactus.navigate();	
	
	Search Search = new Search(driver);
	Search.navigate();
	
    }
}
