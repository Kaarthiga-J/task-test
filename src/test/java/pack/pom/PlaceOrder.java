package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class PlaceOrder extends BaseClass{
	
	public PlaceOrder() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="checkout_username")
	private WebElement username;
	
	@FindBy(id="checkout_password")
	private WebElement password;
	
	@FindBy(id="checkout-login-existuser")
	private WebElement cont;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCont() {
		return cont;
	}
	

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getAdd1() {
		return add1;
	}

	public WebElement getAdd2() {
		return add2;
	}

	public WebElement getProceed() {
		return proceed;
	}
	@FindBy(id="postcode")
	private WebElement pincode;
	
	@FindBy(id="townCity")
	private WebElement city;
	
	@FindBy(id="regionIso")
	private WebElement state;
	
	@FindBy(id="address1")
	private WebElement add1;
	
	@FindBy(id="address2")
	private WebElement add2;
	
	@FindBy(id="checkout_proceed_to_pay_submit")
	private WebElement proceed;

	public WebElement getPincode() {
		// TODO Auto-generated method stub
		return pincode;
	}

	
	
	

}
