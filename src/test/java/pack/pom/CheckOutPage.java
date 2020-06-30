package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class CheckOutPage extends BaseClass{
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn-place-order']")
	private WebElement checkout;
	
	@FindBy(xpath="(//button[@class='btndefault'])[2]")
	private WebElement contshop;

	
	public WebElement getContshop() {
		return contshop;
	}

	public WebElement getCheckout() {
		// TODO Auto-generated method stub
		return checkout;
	}

	
	

}
