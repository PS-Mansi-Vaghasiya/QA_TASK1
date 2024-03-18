package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginPageObjects extends SeleniumMethods {



	public LoginPageObjects(WebDriver driver) {
		super(driver);
	}

	private By usernameField = By.id("input28");
	private By nextbutton = By.xpath("//input[@value='Next']");
	private By passwordField = By.id("input60");

	private By verifyButton = By.xpath("//input[@value='Verify']");
	private By homePageText = By.xpath("//span[@class='pull-right fa fa-fw fa-search']");
	private By errormessageininvalidlogin = By.xpath("//div[@class='okta-form-infobox-error infobox infobox-error']");
	private By helpbutton = By.xpath("//a[@class='link js-help']");
	private By homesupportpagetext = By.xpath("//h2[normalize-space()='Trouble Signing In?']");

	private By keepmesignedinbutton = By.xpath("//label[@for='input36']");
	private By clickonlogoutbutton = By.xpath("//a[@title='Log off']");
    
	private By clickonunlockbutton = By.xpath("//a[@class='link js-unlock']");
	private By enterusername = By.id("input30");
	private By selectbutton = By.xpath("//a[@aria-label='Select Email.']");
	/*
	 * private By sendmeanemailbutton =
	 * By.xpath("//input[@value='Send me an email']");
	 */	private By userfriednlymessageunlocking = By.xpath("//p[@id='input-container-error46']");

	public void portalLoginPage(String URL) {
		navigateURL(URL);

	}

	public void validcredentials(String Username, String Password) {

		sendKeys(usernameField, Username);

		clickOn(nextbutton);
		sendKeys(passwordField, Password);

	}

	public void invalidcredentials(String iusername, String ipassword) {
		sendKeys(usernameField, iusername);
		clickOn(nextbutton);

		sendKeys(passwordField, ipassword);
	}

	public void clickverify() {
		clickOn(verifyButton);

	}

	public String getErrorMessageText() {
		return getText(homePageText);
	}

	public String geterrormessagetext1() {
		return getText(errormessageininvalidlogin);
	}

	public void clickonhelpbutton() {
		clickOn(helpbutton);
	}

	public String supportpageverify() {
		return getText(homesupportpagetext);
	}

	public void username(String Username) {
		sendKeys(usernameField, Username);
	}

	public void clickonkeepmesignedinbtton() {
		clickOn(keepmesignedinbutton);
		clickOn(nextbutton);
	}

	public void password(String Password) {
		sendKeys(passwordField, Password);
	}

	public void logoutbutton(String URL) {
		clickOn(clickonlogoutbutton);
		openNewTab(URL);

	}

	public void enterdetails(String Username) throws InterruptedException {
		Thread.sleep(3000);

		sendKeys(usernameField, Username);
		clickOn(clickonunlockbutton);
	}

	public void enterusernameeandselectname(String Username) throws InterruptedException {
     Thread.sleep(3000);
		sendKeys(enterusername, Username);
		clickOn(selectbutton);
	}

	

	public void usernamefieldemptyandselectbutton(String username) {
		sendKeys(enterusername, username);
		clickOn(selectbutton);
	}

	public void userfriendlymessage() {
		getText(userfriednlymessageunlocking);

	}

}
