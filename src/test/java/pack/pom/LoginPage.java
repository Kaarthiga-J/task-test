package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="j_username")
	private WebElement user;
	@FindBy(id="j_password")
	private WebElement pass;
	@FindBy(id="loginajax")
	private WebElement button;
	@FindBy(xpath="//span[@class='login-account-not-found']")
	private WebElement incorrect;
	@FindBy(id="j_password-error")
	private WebElement min;
	public WebElement getIncorrect() {
		return incorrect;
	}
	public WebElement getMin() {
		return min;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getButton() {
		return button;
	}

}
