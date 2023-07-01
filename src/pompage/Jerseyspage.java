package pompage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jerseyspage {
	
	
	WebDriver driver;
	
	
	
	By jersey=By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div/header/div[1]/div/div[2]/ul/li[2]/a");
	By jacket= By.xpath("//*[@id=\"shopify-section-list-collections-template\"]/div/div/div[5]/a");
	By filter= By.xpath("//*[@id=\"SortBy\"]");
	
	public Jerseyspage(WebDriver driver) {
		
		this.driver=driver;
		
	
	}
	
	
	public void jerseySelection() {
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));

		driver.findElement(jersey).click();
		driver.findElement(jacket).click();
	}
	
	public void filters()
	{
		
		WebElement sort= driver.findElement(filter);
		
		Select sorting= new Select(sort);
		sorting.selectByVisibleText("Best selling");
		System.out.println(driver.getTitle());
	}
	
	
	
}
