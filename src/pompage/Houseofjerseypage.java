package pompage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Houseofjerseypage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	By email= By.xpath("//*[@id=\"CustomerEmail\"]");
	By pass= By.xpath("//*[@id=\"CustomerPassword\"]");
	By submit=By.xpath("//*[@id=\"customer_login\"]/p[1]/input");
	
	
	
	
	public Houseofjerseypage(WebDriver driver) {
		
		this.driver= driver;
		}


	public void loginprocess()  {
		
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
//		WebElement emailInput= wait.until(ExpectedConditions.visibilityOfElementLocated(email));

				
		

		driver.findElement(email).sendKeys("akhilanilchengalam7@gmail.com", Keys.ENTER);
		driver.findElement(pass).sendKeys("Global12$", Keys.ENTER);
		driver.findElement(submit).click();
		
		
			
	}
	
	

}
