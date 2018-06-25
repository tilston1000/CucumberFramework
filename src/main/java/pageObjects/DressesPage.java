package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {
	
	WebDriver driver;

	public DressesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToDressesPage() {
		WebElement dressesButton = driver.findElement(By.className("sf-with-ul"));	
		dressesButton.click();
	}

	public void selectMostExpensiveDress() {
		WebElement mostExpensiveDress = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
		mostExpensiveDress.click();
	}

	public void ClickOnContinueShoppingButton() throws InterruptedException {
		WebElement continueShoppingButton = driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span"));
		Thread.sleep(3000);
		continueShoppingButton.click();		
	}

	public void LogOutOfSite() {
		WebElement logoutButton = driver.findElement(By.className("logout"));
		logoutButton.click();	
	}

}
