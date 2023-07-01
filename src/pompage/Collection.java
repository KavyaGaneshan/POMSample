package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Collection {
	
	
	WebDriver driver;
	
	
	By collect= By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div/header/div[1]/div/div[2]/ul/li[3]/a");
	
	By fan=By.xpath("//*[@id=\"shopify-section-header\"]/div[3]/div/header/div[1]/div/div[2]/ul/li[3]/ul/li[1]/a");
	
	By jersey= By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[1]/div[3]/div[1]/a/div[2]/div[1]");
	
	By nametoprint= By.xpath("//*[@id=\"name\"]");
	By number=By.xpath("//*[@id=\"number\"]");
	
	
	By size=By.xpath("//*[@id=\"SingleOptionSelector-7452713418933-option-0\"]");
	
	//By closecart= By.xpath("//*[@id=\"CartDrawer\"]/div[1]/div/div[2]/button");
	
//	By cart= By.xpath("//*[@id=\"AddToCart-7452713418933\"]");
//	
//	By help= By.xpath("/html/body/div[14]/div[2]/a");
	
	By checkout= By.xpath("//*[@id=\"CartContainer\"]/form/div[2]/button[2]");
	
	
	//By login= By.xpath("//*[@id=\"Form0\"]/div[1]/div/div[2]/div[1]/section/div/div[1]/span/a");
	
	
	public Collection(WebDriver driver) {

	this.driver=driver;
	}




	public void selection () {
		
		WebElement elec=driver.findElement(collect);

		Actions act= new Actions(driver);
		act.moveToElement(elec);
		act.perform();
		
		driver.findElement(fan).click();
		driver.findElement(jersey).click();
		
	
	}
	
	
public void sizeselection() {
	
	
	WebElement dropdown= driver.findElement(size);
	
	Select tshirtsize= new Select(dropdown);
	
	tshirtsize.selectByVisibleText("XL");
	
	driver.findElement(nametoprint).sendKeys("DE BRUYNE",Keys.ENTER );
	
	driver.findElement(number).sendKeys("17", Keys.ENTER);
	driver.findElement(checkout).click();

	
//	driver.findElement(closecart).click();

}
	
//public void cart() {
//	
//    driver.findElement(cart).click();
	//driver.findElement(login).click();
//	
//	
//}

}
