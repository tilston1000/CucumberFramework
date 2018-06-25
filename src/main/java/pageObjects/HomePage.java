package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void navigateToHomePage()
	{
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	public void clickOnLoginButton()
	{
		WebElement login = driver.findElement(By.className("login"));
		login.click();
	}

}
