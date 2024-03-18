package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import utilities.BaseClass;

public class LoginPageSteps {
	WebDriver driver;
	Properties prop;
	Logger logger;

	public LoginPageSteps() {
		this.driver = BaseClass.getDriver();
		this.prop = BaseClass.getProperties();
		this.logger = BaseClass.getLogger();
	}

	LoginPageObjects loginPageObjects;

	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
		loginPageObjects = new LoginPageObjects(driver);
		logger.info("*****************opening url*****************");
		loginPageObjects.portalLoginPage(prop.getProperty("URL"));
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_Username_and_Password() throws InterruptedException {
		loginPageObjects.validcredentials(prop.getProperty("Username"), prop.getProperty("Password"));
	}

	@When("click on verify button")
	public void click_on_verify_button() throws InterruptedException {
		Thread.sleep(3000);
		loginPageObjects.clickverify();
	}

	@Then("User is redirected to Homepage of Okta")
	public void user_is_redirected_to_homepage_of_okta() {
		loginPageObjects.getErrorMessageText();
	}

	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		loginPageObjects.invalidcredentials(prop.getProperty("iusername"), prop.getProperty("ipassword"));
	}

	@Then("User should get error message")
	public void user_should_get_error_message() {
		loginPageObjects.geterrormessagetext1();
	}

	@When("User clicks on help button")
	public void user_clicks_on_help_button() {
		loginPageObjects.clickonhelpbutton();
	}

	@Then("User should get redirected to Home page")
	public void user_should_get_redirected_to_home_page() {
		loginPageObjects.supportpageverify();
	}

	@When("User enters username and clicks on keepmesignedin button")
	public void user_enters_username_and_clicks_on_keepmesignedin_button() {
		loginPageObjects.username(prop.getProperty("Username"));
		loginPageObjects.clickonkeepmesignedinbtton();
	}

	@When("click on next button to enter password and click on verify button")
	public void click_on_next_button_to_enter_password_and_click_on_verify_button() {

		loginPageObjects.password(prop.getProperty("Password"));
		loginPageObjects.clickverify();
	}

	@Then("User should get redirected to Home pagee and click on logout button")
	public void user_should_get_redirected_to_home_pagee_and_click_on_logout_button() {
		loginPageObjects.getErrorMessageText();
		loginPageObjects.logoutbutton(prop.getProperty("URL"));
		loginPageObjects.getErrorMessageText();
	}

	@When("User enters the username  and clicks Unlock Account button")
	public void user_enters_the_username_and_clicks_unlock_account_button() throws InterruptedException {
		
		loginPageObjects.enterdetails(prop.getProperty("Username"));
	}

	@When("User enters the username and clicks on select button")
	public void user_enters_the_username_and_clicks_on_select_button() throws InterruptedException {
		loginPageObjects.enterusernameeandselectname(prop.getProperty("Username"));
	}

	

	@When("User enters username and clicks Unlock Account button")
	public void user_enters_username_and_clicks_unlock_account_button() throws InterruptedException {
		loginPageObjects.enterdetails(prop.getProperty("Username"));
	}

	@When("User keeps username field empty and clicks on select button")
	public void user_keeps_username_field_empty_and_clicks_on_select_button() {
		loginPageObjects.usernamefieldemptyandselectbutton(prop.getProperty("username"));
	}

	@Then("user friendly message should be displayed")
	public void user_friendly_message_should_be_displayed() {
		loginPageObjects.userfriendlymessage();
	}

}
