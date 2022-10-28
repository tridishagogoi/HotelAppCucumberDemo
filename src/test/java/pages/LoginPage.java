package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this); // initializing the login page from the constructor
	}

	@FindBy(id = "username")
	private WebElement uName;

	@FindAll({ @FindBy(id = "password"), @FindBy(name = "password") })
	private WebElement pwd;

	@FindBy(id = "login")
	private WebElement loginButton;

	public void enterUsername(String user) {
		uName.sendKeys(user);
	}

	public void enterPassword(String pass) {
		pwd.sendKeys(pass);
	}

	public void clickLoginButton() {
		loginButton.click();

	}
}
