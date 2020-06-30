package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class ProductDetailPage extends BaseClass{
	
	public ProductDetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAdd() {
		return add;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getQuickbuy() {
		return quickbuy;
	}

	public WebElement getCodbtn() {
		return codbtn;
	}
	
	@FindBy(id="quick_buy_id")
	private WebElement quickbuy;
	

	@FindBy(id="addToCartButton")
	private WebElement add;
	
	@FindBy(id="pincodetxt")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@class='codbtn']")
	private WebElement codbtn;
	
	@FindBy(xpath="//a[@class='minicart bags bag bag-container']")
	private WebElement cart;
	
public WebElement getCart() {
		return cart;
	}



@FindBy(xpath="(//span[@class='no-del'])[2]")
private WebElement message;

@FindBy(id="chngbtnLabel")
private WebElement change;

public WebElement getMessage() {
	return message;
}

public WebElement getChange() {
	return change;
}
}
