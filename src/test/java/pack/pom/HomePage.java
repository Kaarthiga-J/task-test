package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getSignin() {
		return signin;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	public WebElement getTrackorder() {
		return trackorder;
	}
	public WebElement getContactus() {
		return contactus;
	}
	public WebElement getAllstores() {
		return allstores;
	}
	@FindBy(xpath="//a[@class='user']")
	private WebElement signin;
	
	@FindBy(id="js-site-search-input")
	private WebElement search;
	
   @FindBy(xpath="//img[@class='web']")
  private WebElement Heroprod;
 
   @FindBy(xpath="//a[@class='minicart bags bag bag-container']")
  private WebElement cart;
 
   @FindBy(xpath="//a[@class='wishlist']")
   private WebElement wishlist;
   
   @FindBy(xpath="//a[@class='OFFERS']")
   private WebElement offers;
   
   @FindBy(xpath="//a[text()='Track Order']")
   private WebElement trackorder;
   
   @FindBy(xpath="//a[text()='Contact Us']")
   private WebElement contactus;
   
   @FindBy(xpath="//a[text()='All Stores']")
   private WebElement allstores;
   
   
   
   public WebElement getSearch() {
	return search;
}
public WebElement getHeroprod() {
	return Heroprod;
}
public WebElement getCart() {
	return cart;
}
public WebElement getWishlist() {
	return wishlist;
}
public WebElement getOffers() {
	return offers;
}
public WebElement getBeauty() {
	return beauty;
}
public WebElement getWomen() {
	return women;
}
public WebElement getMen() {
	return men;
}
public WebElement getHomestop() {
	return homestop;
}
public WebElement getCrossword() {
	return crossword;
}
public WebElement getBrands() {
	return brands;
}
public WebElement getGift() {
	return gift;
}
public WebElement getDiscover() {
	return discover;
}
@FindBy(xpath="//a[@class='BEAUTY']")
   private WebElement beauty;
   
   @FindBy(xpath="//a[@class='WOMEN']")
   private WebElement women;
   
   @FindBy(xpath="//a[@class='MEN']")
   private WebElement men;
   
   @FindBy(xpath="//a[@class='HOMESTOP']")
   private WebElement homestop;
   
   @FindBy(xpath="//a[@class='Crossword']")
   private WebElement crossword;
   
   @FindBy(xpath="//a[@class='BRANDS']")
   private WebElement brands;
   
   @FindBy(xpath="//a[@class='GIFT']")
   private WebElement gift;
   
   @FindBy(xpath="//a[@class='DISCOVER']")
   private WebElement discover;

public WebElement getSubmit() {
	// TODO Auto-generated method stub
	return submit;
}
  
   
	
	
}
