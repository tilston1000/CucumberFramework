package Managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AccountCreationPage;
import pageObjects.DressesPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PostLoginPage;
import pageObjects.ShoppingCartPage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private AccountCreationPage accountCreationPage;
	private DressesPage dressesPage;
	private HomePage homePage;
	private LoginPage loginPage;
	private PostLoginPage postLoginPage;
	private ShoppingCartPage shoppingCartPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return(homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public AccountCreationPage getAccountCreationPage() {
		return(accountCreationPage == null) ? accountCreationPage = new AccountCreationPage(driver) : accountCreationPage;
	}
	
	public DressesPage getDressesPagee() {
		return(dressesPage == null) ? dressesPage = new DressesPage(driver) : dressesPage;
	}
	
	public LoginPage getLoginPage() {
		return(loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	
	public PostLoginPage getPostLoginPage() {
		return(postLoginPage == null) ? postLoginPage = new PostLoginPage(driver) : postLoginPage;
	}
	
	public ShoppingCartPage getShoppingCartPage() {
		return(shoppingCartPage == null) ? shoppingCartPage = new ShoppingCartPage(driver) : shoppingCartPage;
	}

}
