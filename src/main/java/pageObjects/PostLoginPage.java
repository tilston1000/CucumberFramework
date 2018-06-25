package pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostLoginPage {
	
	WebDriver driver;
	
	public PostLoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public boolean isHomeElementPresent(String id) throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(id));
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;

	}
	

}
