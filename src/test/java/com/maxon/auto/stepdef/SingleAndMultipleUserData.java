package com.maxon.auto.stepdef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;








import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fol.UserData;
import com.maxon.auto.abstractPage.AbstractPageStepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingleAndMultipleUserData extends AbstractPageStepDefinitions {
	
	WebDriver driver;
	Scenario scenario;	
	
	@Before("@Firefox")
	public void testSetup(Scenario scenario1)
	{     this.scenario= scenario1; 
	      driver = getDriver("Firefox");
	      System.out.println("Starting test in Firefox Browser");
	      System.out.println("Test Environment Set up ");
          System.out.println("----------------------------------------------------------------------");
          System.out.println("Executing Scenario :"+scenario1.getName());
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	
	@Before("@Edge")
	public void testSetup1(Scenario scenario1)
	{     this.scenario= scenario1; 
	      driver =  getDriver("Edge");
	      System.out.println("Starting test in Edge Browser");
	      System.out.println("Test Environment Set up ");
          System.out.println("----------------------------------------------------------------------");
          System.out.println("Executing Scenario :"+scenario1.getName());
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@After()
	public void tearDown(Scenario scenario)
	{scenario.write("Finished scenario");
		if (scenario.isFailed()){
         scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
      }
     System.out.println("Test Environment Destroyed ");
     System.out.println("----------------------------------------------------------------------");
     driver.close();
     driver.quit();
	 }	

	

@Given("^I ve' a valid set of data and access to the Registration page$")
public void user_on_home_page() throws Throwable {
	/*String mainwindow = driver.getWindowHandle();

	driver.switchTo().window(mainwindow);*/

	scenario.write("Navigating to Mercury Flight Demo Page");

	driver.get("http://newtours.demoaut.com/mercurywelcome.php");

	driver.manage().window().maximize();
   
}

@When("^Registration page is displayed$")
public void registration_page() throws Throwable {	
	scenario.write("Navigating Registration page");
	WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER"))); 
//*********using javascript executor to open the registration page in same window********
    WebElement register = driver.findElement(By.linkText("REGISTER"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('target','_self');",register);
    register.click(); }


	@Then("^I enter valid data$")
	public void i_enter_valid_data(DataTable userData) throws Throwable {
		List<List<String>> data = userData.raw();
         for (int i = 0; i < data.size(); i++)
       {
     System.out.println(data.get(i).toString());
       }
// ******filling up details in register page******/
        driver.findElement(By.cssSelector("input[name*='firstName']"))
				.sendKeys(data.get(0).get(1).toString());
        driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys(
				data.get(1).get(1).toString());
        driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys(
				data.get(2).get(1).toString());
        driver.findElement(By.cssSelector("input[id*='userName']")).sendKeys(
				data.get(3).get(1).toString());
        driver.findElement(By.xpath("//input[@id='email'][@name='email']"))
				.sendKeys(data.get(4).get(1));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
				data.get(5).get(1));
        driver.findElement(By.xpath("//input[starts-with(@name,'confirmP')]"))
				.sendKeys(data.get(6).get(1));
        // scenario.write("Entering User Registration Details");
        }
	
	
	@Then("^I enter valid data on registration page and verify post-registration$")
	public void enter_valid_data_verify_post_registration(DataTable indata) throws Throwable {
	   List<Map<String,String>> endata = indata.asMaps(String.class,String.class);
	   scenario.write("Entering Registration Data");
	   
	   for(Map<String, String> inputdata : endata){
		   System.out.println("Registration :"+inputdata.get("first_name")+""+inputdata.get("last_name"));
		   driver.findElement(By.cssSelector("input[name*='firstName']")).sendKeys(inputdata.get("first_name"));
		   driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys(inputdata.get("last_name"));
		   driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys(inputdata.get("phone"));
		   driver.findElement(By.cssSelector("input[id*='userName'][name*='userName']")).sendKeys(inputdata.get("email"));
		   driver.findElement(By.cssSelector("input[id*='email'][name*='email']")).sendKeys(inputdata.get("username"));
		   driver.findElement(By.cssSelector("input[id*='email'][name*='email']")).sendKeys(inputdata.get("password"));
		   driver.findElement(By.cssSelector("input[name*='confirmPassword'][type*='password']")).sendKeys(inputdata.get("confirm_pwd"));
		
		 //click submit button			    
           driver.findElement(By.xpath("//input[contains(@src,'submit.gif')]")).click();
         //asserting post registration			    
   	       String msg = driver.findElement(By.xpath("//*[contains(text(),'Thank you for registering')]")).getText();
       	   System.out.println(msg);
       	   Assert.assertTrue("Text is not getting displayed properly",msg.contains("Thank you for registering."));    
          //going to register link after post successful registration of other user
           WebElement register = driver.findElement(By.linkText("REGISTER"));
          ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('target','_self');",register);
           register.click();
	   }
	   	
	}
	

@Then("^I enter valid data on registration page and check if registration is successfull$")
public void data_and_registration_success(List<UserData> userdata) throws Throwable {
	for(UserData Usdt : userdata){
	
		System.out.println("Registration :"+Usdt.getFirstName()+""+Usdt.getLastName());
		   driver.findElement(By.cssSelector("input[name*='firstName']")).sendKeys(Usdt.getFirstName());
		   driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys(Usdt.getLastName());
		   driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys(Usdt.getPhone());
		   driver.findElement(By.cssSelector("input[id*='userName'][name*='userName']")).sendKeys(Usdt.getEMail());
		   driver.findElement(By.cssSelector("input[id*='email'][name*='email']")).sendKeys(Usdt.getUserName());
		   driver.findElement(By.cssSelector("input[id*='email'][name*='email']")).sendKeys(Usdt.getPassword());
		   driver.findElement(By.cssSelector("input[name*='confirmPassword'][type*='password']")).sendKeys(Usdt.getConfirmPassword());
			
		   //click submit button			    
           driver.findElement(By.xpath("//input[contains(@src,'submit.gif')]")).click();
         //asserting post registration			    
   	       String msg = driver.findElement(By.xpath("//*[contains(text(),'Thank you for registering')]")).getText();
       	   System.out.println(msg);
       	   Assert.assertTrue("Text is not getting displayed properly",msg.contains("Thank you for registering."));    
          //going to register link after post successful registration of other user
           WebElement register = driver.findElement(By.linkText("REGISTER"));
          ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('target','_self');",register);
           register.click();
		
		
		
	}
	
   
}

	
	

@Then("^Click on the submit button$")
public void click_on_the_submit_button() throws Throwable {
	driver.findElement(By.xpath("//input[contains(@src,'submit.gif')]")).click();
}

@Then("^Thank you for registering: should be displayed$")
public void thank_you_for_registration_should_be_displayed() throws Throwable {
    String msg = driver.findElement(By.xpath("//*[contains(text(),'Thank you for registering')]")).getText();
    System.out.println(msg);
    Assert.assertTrue("Text is not getting displayed properly",msg.contains("Thank you for registering.")); 
}

@Then("^Click on the Signoff Button$")
public void Signoff() throws Throwable {
System.out.println("Clicking on ::"+driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).getText());
driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).click();
   
}

}
