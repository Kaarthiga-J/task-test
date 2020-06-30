package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class WelcomePage extends BaseClass{
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="js-site-search-input")
	private WebElement search;
	
 @FindBy(xpath="//a[text()='Edit Profile']")
 private WebElement editprofile;
 
 @FindBy(xpath="//a[@title='Wishlist']")
 private WebElement Wishlist;
 
 @FindBy(xpath="//a[@title='My Orders']")
 private WebElement myorders;
 
 @FindBy(xpath="//a[@title='Pick Up Orders']")
 private WebElement pickuporders;
 
 @FindBy(xpath="//a[@title='Return/Exchanges']")
 private WebElement Retexc;
 
 @FindBy(xpath="//a[@title='Offline Store Orders']")
 private WebElement offstrorder;
 
 
 @FindBy(xpath="//a[@title='Shoppers Stop Wallet']")
 private WebElement sswallet;
 
 @FindBy(xpath="//a[@title='First Citizen']")
 private WebElement firstcitizen;
 
 @FindBy(xpath="//a[@title='Gift Card/Gift Vouchers']")
 private WebElement gift;
 
 @FindBy(xpath="//a[@title='Saved Cards']")
 private WebElement savedcards;
 
 @FindBy(xpath="//a[@title='Profile']")
 private WebElement profile;
 
 @FindBy(xpath="//a[@title='Addresses']")
 private WebElement addressess;
 
 public WebElement getSearch() {
	return search;
}

public WebElement getEditprofile() {
	return editprofile;
}

public WebElement getWishlist() {
	return Wishlist;
}

public WebElement getMyorders() {
	return myorders;
}

public WebElement getPickuporders() {
	return pickuporders;
}

public WebElement getRetexc() {
	return Retexc;
}

public WebElement getOffstrorder() {
	return offstrorder;
}

public WebElement getSswallet() {
	return sswallet;
}

public WebElement getFirstcitizen() {
	return firstcitizen;
}

public WebElement getGift() {
	return gift;
}

public WebElement getSavedcards() {
	return savedcards;
}

public WebElement getProfile() {
	return profile;
}

public WebElement getAddressess() {
	return addressess;
}

public WebElement getRr() {
	return rr;
}

public WebElement getSethomestore() {
	return sethomestore;
}

public WebElement getChangepass() {
	return changepass;
}

public WebElement getNews() {
	return news;
}

public WebElement getFeedback() {
	return feedback;
}
@FindBy(xpath="//a[@title='Reviews & Ratings']")
 private WebElement rr;
 
 @FindBy(xpath="//a[@title='Set Home Store']")
 private WebElement sethomestore;
 
 @FindBy(xpath="//a[@title='Change Password']")
 private WebElement changepass;
 
 @FindBy(xpath="//a[@title='Newsletter Subscription']")
 private WebElement news;
 
 @FindBy(xpath="//a[@title='Feedback']")
 private WebElement feedback;
 
 
 }
