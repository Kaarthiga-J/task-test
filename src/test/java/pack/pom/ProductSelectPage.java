package pack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.base.BaseClass;

public class ProductSelectPage extends BaseClass{
	
	public ProductSelectPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//div[@class='ex-checkbox'])[17]")
	private WebElement all;
	
	
	
	@FindBy(xpath="(//div[@class='pro-info'])")
	private WebElement prod;



	public WebElement getAll() {
		return all;
	}



	public WebElement getProd() {
		return prod;
	}

}
