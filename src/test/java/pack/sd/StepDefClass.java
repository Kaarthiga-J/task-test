package pack.sd;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pack.base.BaseClass;
import pack.pom.HomePage;
import pack.pom.LoginPage;
import pack.pom.WelcomePage;

public class StepDefClass extends BaseClass {
	
	public static WebDriver driver;
@Given("Launch browser")
public void launch_browser() {
    driver=launchBrowser();
}

@Given("Load Shopperstop url")
public void load_Shopperstop_url() throws InterruptedException {
    loadUrl("https://www.shoppersstop.com/");
    Thread.sleep(5000);
}

@When("Enter into login page")
public void enter_into_login_page() throws InterruptedException {
	HomePage obj=new HomePage();
	enterLogin(obj.getSignin());
	Thread.sleep(6000);
	
	
}
@When("Enter uesrname and password")
public void enter_uesrname_and_password(io.cucumber.datatable.DataTable up) throws InterruptedException {
    List<Map<String,String>> mp=up.asMaps();
    LoginPage obj=new LoginPage();
    	typeValue(obj.getUser(), mp.get(0).get("email-id/mobile no"));
        typeValue(obj.getPass(), mp.get(0).get("password"));
        System.out.println(obj.getUser().getAttribute("value"));
        System.out.println(obj.getPass().getAttribute("value"));
        Thread.sleep(6000);
        
        
	}
    @When("Click login button")
    public void click_login_button() throws InterruptedException {
    	LoginPage obj=new LoginPage();
    	clickButton(obj.getButton());
    	Thread.sleep(5000);
    }

    @Then("Validate Logging in succesufully")
    public void validate_Logging_in_succesufully() {
        String url=driver.getCurrentUrl();
        boolean b1=url.contains("my-account");
        Assert.assertTrue(b1);
        System.out.println("logged in successfully");
    }
    @When("Enter {string} and {string}")
    public void enter_and(String s1, String s2) throws InterruptedException {
    	LoginPage obj=new LoginPage();
    	typeValue(obj.getUser(),s1 );
        typeValue(obj.getPass(),s2 );
        System.out.println(obj.getUser().getAttribute("value"));
        System.out.println(obj.getPass().getAttribute("value"));
        Thread.sleep(1000);
        clickButton(obj.getButton());
        if(s2.length()<5) {
        	boolean b=obj.getMin().isDisplayed();
        	Assert.assertTrue(b);
        	System.out.println("error message displaying correctly");
        	obj.getUser().clear();
        	obj.getPass().clear();
        	
        }
        else if(obj.getIncorrect().isEnabled())  {
        	//System.out.println(obj.getIncorrect().getText());
            System.out.println("Your username or password is incorrect");
            obj.getUser().clear();
        	obj.getPass().clear();
    	}
        
      }
          	        
    	        
@Then("Login doesn't occur for invalid.")
public void login_doesn_t_occur_for_invalid() {
	 String url=driver.getCurrentUrl();
     boolean b1=url.contains("my-account");
     Assert.assertTrue(b1);
     System.out.println("logged in successfully");
}
}

