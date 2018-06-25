package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreationPage {
	
	WebDriver driver;
	String firstName = "Andy";
	String secondName = "Tilston";
	
	public AccountCreationPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void createLogin() throws InterruptedException
	{

		WebElement titleRadioButton = driver.findElement(By.id("id_gender1"));
		WebElement customerFirstNameTextbox = driver.findElement(By.id("customer_firstname"));
		WebElement customerLastNameTextBox = driver.findElement(By.id("customer_lastname"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement dateOfBirthDays = driver.findElement(By.id("days"));
		WebElement dateOfBirthMonths = driver.findElement(By.id("months"));
		WebElement dateofBirthYears = driver.findElement(By.id("years"));
		WebElement firstNameTextBox = driver.findElement(By.id("firstname"));
		WebElement lastNameTextBox = driver.findElement(By.id("lastname"));
		WebElement addressTextBox = driver.findElement(By.id("address1"));
		WebElement cityTextBox = driver.findElement(By.id("city"));
		WebElement stateDDL = driver.findElement(By.id("id_state"));
		WebElement postCode = driver.findElement(By.id("postcode"));
		WebElement mobilePhoneNumberTextbox = driver.findElement(By.id("phone_mobile"));
		WebElement addressAlias = driver.findElement(By.id("alias"));
		WebElement registerButton = driver.findElement(By.id("submitAccount"));		
		
	
		Thread.sleep(3000);
		titleRadioButton.click();		
		customerFirstNameTextbox.sendKeys(firstName);
		customerLastNameTextBox.sendKeys(secondName);
		password.sendKeys("Password1!");
		dateOfBirthDays.sendKeys("10");
		dateOfBirthMonths.sendKeys("October");
		dateofBirthYears.sendKeys("1981");
		firstNameTextBox.sendKeys(firstName);
		lastNameTextBox.sendKeys(secondName);
		addressTextBox.sendKeys("Andy's Address");
		cityTextBox.sendKeys("Test City");
		stateDDL.sendKeys("Alabama");
		postCode.sendKeys("12345");
		mobilePhoneNumberTextbox.sendKeys("12345678912");
		addressAlias.sendKeys("addressAlias");
		registerButton.click();		
	}
	

}
