package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import junit.framework.Assert;

public class ShoppingCartPage {
	
	WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;		
	}

	public void clickOnShoppingCartButton() {
		WebElement shoppingCartButton = driver.findElement(By.className("shopping_cart"));
		shoppingCartButton.click();
	}

	public void verifyThatItemIsInBasket() {
		WebElement totalPrice = driver.findElement(By.xpath(".//*[@id='total_price']"));
		boolean bool = totalPrice.isDisplayed();
		Assert.assertEquals(true, bool);
		
	}

}
