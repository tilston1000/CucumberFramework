package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	Long ts = System.currentTimeMillis();
	


	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void accountCreation() {
		WebElement emailAddress = driver.findElement(By.id("email_create"));
		WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
		
		emailAddress.sendKeys("andytilston" + ts + "@gmail.com");
		createAccountButton.click();	
	}
	
	public void loginAsExistingUser() {
		WebElement passwordAlreadyRegistered = driver.findElement(By.id("passwd"));
		WebElement signinButton = driver.findElement(By.id("SubmitLogin"));
		WebElement emailAddressAlreadyRegistered = driver.findElement(By.id("email"));
		
		emailAddressAlreadyRegistered.sendKeys("andytilston@gmail.com");
		passwordAlreadyRegistered.sendKeys("Password1!");
		signinButton.click();
	}

}
