package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Managers.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AccountCreationPage;
import pageObjects.DressesPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PostLoginPage;
import pageObjects.ShoppingCartPage;

public class Test_Steps {
	
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	PostLoginPage postLoginPage;
	DressesPage dressesPage;
	AccountCreationPage accountCreationPage;
	PageObjectManager pageObjectManager;
	ShoppingCartPage shoppingCartPage;
	
	@Given("^a new user on the automation practise$")
	public void a_new_user_is_on_the_automation_practise_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "<file location>");
		driver = new ChromeDriver();	
		
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateToHomePage();
	}

	@When("^they create a new account$")
	public void they_create_a_new_account() throws Throwable {
		homePage.clickOnLoginButton();
		loginPage = pageObjectManager.getLoginPage();
		loginPage.accountCreation();
		
		accountCreationPage = pageObjectManager.getAccountCreationPage();
		Thread.sleep(3000);
		accountCreationPage.createLogin();
	}

	@Then("^they can login successfully$")
	public void they_can_login_successfully() throws Throwable {
		postLoginPage = pageObjectManager.getPostLoginPage();
		
		Assert.assertTrue(postLoginPage.isHomeElementPresent(".//*[@id='center_column']/ul/li/a/span"));
		driver.close();
		driver.quit();
	}

	@Given("^a user logs in to the site$")
	public void a_user_logs_in_to_the_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilst\\Projects\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		pageObjectManager = new PageObjectManager(driver);
		
		homePage = pageObjectManager.getHomePage();
		homePage.navigateToHomePage();
		homePage.clickOnLoginButton();
		
		loginPage = pageObjectManager.getLoginPage();
		loginPage.loginAsExistingUser(); 
	}

	@Given("^adds the most expensive dress to the shopping cart$")
	public void adds_the_most_expensive_dress_to_the_shopping_cart() throws Throwable {
	    dressesPage = pageObjectManager.getDressesPagee();
	    dressesPage.navigateToDressesPage();
	    dressesPage.selectMostExpensiveDress();
	}

	@When("^they log out of the site$")
	public void they_log_out_of_the_site() throws Throwable {
		dressesPage.ClickOnContinueShoppingButton();
		dressesPage.LogOutOfSite();
	}

	@When("^then log back in$")
	public void then_log_back_in() throws Throwable {
		homePage.clickOnLoginButton();		
		loginPage.loginAsExistingUser(); 
	}

	@Then("^the dress is retained in the shopping cart$")
	public void the_dress_is_retained_in_the_shopping_cart() throws Throwable {
	    shoppingCartPage = pageObjectManager.getShoppingCartPage();
	    shoppingCartPage.clickOnShoppingCartButton();
	    shoppingCartPage.verifyThatItemIsInBasket();
	}

}
