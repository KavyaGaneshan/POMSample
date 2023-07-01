package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepageloading {
	
	
	
	WebDriver driver;
	
	By home=By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div/header/div[1]/div/div[2]/ul/li[1]/a");
	
	
	public Homepageloading(WebDriver driver) {
		
		this.driver=driver;
	}


	public void homePage() {
	
	driver.findElement(home).click();
	

}
}
