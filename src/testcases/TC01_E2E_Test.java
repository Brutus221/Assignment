package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
public class TC01_E2E_Test {
	
	static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}

	@Test
	public void loginTest() throws Exception {
		LoginPage page = new LoginPage(driver);
		page.enterUsername();
		page.enterPassword();
		page.clickBtn();
		LoginPage cart = new LoginPage(driver);
		cart.clickBtn1();
		cart.clickBtn2();
		cart.clickBtn3();
	
		
	}
	
	@Test
	public void tearDown() {
		driver.quit();
		
	}
}


