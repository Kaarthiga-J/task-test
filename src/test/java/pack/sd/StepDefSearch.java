package pack.sd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pack.base.BaseClass;
import pack.pom.CheckOutPage;
import pack.pom.HomePage;
import pack.pom.PlaceOrder;
import pack.pom.ProductDetailPage;
import pack.pom.ProductSelectPage;

public class StepDefSearch extends BaseClass {
	@Given("load Url")
	public void load_Url() {
	   driver=launchBrowser();
	   loadUrl("https://www.shoppersstop.com/");
	}

	@When("search Items")
	public void search_Iems() throws InterruptedException {
		HomePage obj=new HomePage();
		//ProductSelectPage obj1=new ProductSelectPage();
		//ProductDetailPage obj2=new ProductDetailPage();
		 Thread.sleep(3000);
	    typeValue(obj.getSearch(),"Maybelline products");
	    clickButton(obj.getSubmit());
	 
	   /*clickButton(obj1.getProd());	
	   typeValue(obj2.getPincode(), "60007");
	   clickButton(obj2.getCodbtn());
	   if(obj2.getMessage().isDisplayed()) {
		   clickButton(obj2.getChange());
		   typeValue(obj2.getPincode(), "600071");*/
	   }
	   
	   
	    
	

	@When("select the product")
	public void select_the_product() throws InterruptedException {
		ProductSelectPage obj1=new ProductSelectPage();
		//ProductDetailPage obj2=new ProductDetailPage();
		Thread.sleep(3000);
		clickButton(obj1.getProd());	
		Thread.sleep(3000);
		/*typeValue(obj2.getPincode(), "60007");
		   clickButton(obj2.getCodbtn());
		   if(obj2.getMessage().isDisplayed()) {
			   clickButton(obj2.getChange());
			   typeValue(obj2.getPincode(), "600071");*/
	}
	@Then("Verify product displays correctly")
	public void verify_product_displays_correctly() throws InterruptedException {
		ProductDetailPage obj2=new ProductDetailPage();
		Thread.sleep(2000);
		 clickButton(obj2.getAdd());
		/*typeValue(obj2.getPincode(), "60007");
		   clickButton(obj2.getCodbtn());
		   Thread.sleep(2000);
		   if(obj2.getMessage().isDisplayed()) {
			   clickButton(obj2.getChange());
			   typeValue(obj2.getPincode(), "600071");
			   
	}*/
	}

	@Then("Add the product to cart")
	public void add_the_product_to_cart() throws InterruptedException {
	   ProductDetailPage obj=new ProductDetailPage();
	   CheckOutPage obj2=new CheckOutPage();
	   PlaceOrder obj3=new PlaceOrder();
	  // clickButton(obj.getAdd());
	   Thread.sleep(2000);
	   clickButton(obj.getCart());
	   Thread.sleep(2000);
	   clickButton(obj2.getCheckout());
	   Thread.sleep(2000);
	   typeValue(obj3.getUsername(), "9677823327");
	   typeValue(obj3.getPassword(), "password");
	   clickButton(obj3.getCont());
	   Thread.sleep(2000);
	   typeValue(obj3.getPincode(), "600071");
	   typeValue(obj3.getAdd1(), "No.10,Kothari Garden,Vasantham nagar");
	   typeValue(obj3.getAdd2(), "Avadi");
	   clickButton(obj3.getProceed());
	   Thread.sleep(2000);
	   
	   
	}
}
