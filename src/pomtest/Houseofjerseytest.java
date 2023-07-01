package pomtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Collection;
import page.Homepageloading;
import page.Houseofjerseypage;
import page.Jerseyspage;


public class Houseofjerseytest {
	
		
		
		WebDriver driver;	
		WebDriverWait wait;


		@BeforeTest
		public void setUp() {
			
			driver= new ChromeDriver();
			driver.get("https://thehouseofjersey.com/account/login?return_url=%2Faccount");
			driver.manage().window().maximize();


}
		
	@Test	
	public void test() {
		
		
		
		Houseofjerseypage ob = new Houseofjerseypage(driver);
		ob.loginprocess();
		
			
		
	}
	
	@Test
	public void test1() {
		
		Homepageloading ob= new Homepageloading(driver);
		ob.homePage();
	}
	
	@Test	
	public void test2() {
		
		Jerseyspage ob= new Jerseyspage(driver);
		ob.jerseySelection();
		ob.filters();
		
	}
	
	
	@Test
	public void test3() {
		
		Collection ob= new Collection(driver);
		ob.selection();
		ob.sizeselection();
		//ob.cart();
		
	}
		
	}
