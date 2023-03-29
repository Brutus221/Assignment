package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	    this.driver = driver;
		
	}
	
	By enterUsername = By.id("user-name");
	By enterPassword = By.name("password");
	By clickBtn      = By.xpath("//input[@type='submit']");
	By Addtocart = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	By Addtocart2 = By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");
	
	By Viewcart = By.xpath("//a[@class='shopping_cart_link']");
	
	public void enterUsername() {
		driver.findElement(enterUsername).sendKeys("standard_user");
		
	}
    
	public void enterPassword() {
		driver.findElement(enterPassword).sendKeys("secret_sauce");
		
	}
	
	public void clickBtn() throws Exception {
		
		driver.findElement(clickBtn).click();
		Thread.sleep(4000);
		
	}

	public void clickBtn1() throws Exception {
		
		driver.findElement(Addtocart).click();
		Thread.sleep(3000);
	}
public void clickBtn2() throws Exception {
		
		driver.findElement(Addtocart2).click();
		Thread.sleep(3000);
	}
public void clickBtn3() throws Exception {
	
	driver.findElement(Viewcart).click();
	Thread.sleep(6000);
}

}
