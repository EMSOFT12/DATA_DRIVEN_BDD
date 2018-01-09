package com.maxon.auto.stepdef;



import java.util.List;






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


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
public class MecuryFlight  {
	
	WebDriver driver;
	Scenario scenario;	
	
	@Before()
	public void testSetup(Scenario scenario1)
	{     this.scenario= scenario1; 
	      driver = new FirefoxDriver();
	      System.out.println("Test Environment Set up ");
          System.out.println("----------------------------------------------------------------------");
          System.out.println("Executing Scenario :"+scenario1.getName());
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	//@After({"@Registration1,@Registration3"})
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

	@Given("^I am on mecury flight site$")
	public void i_am_on_mecury_flight_site() throws Throwable {
		scenario.write("Navigating to Mercury Flight Demo Page");
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.manage().window().maximize();
	}

	@And("^I click on the regitration page$")
	public void i_click_on_the_regitration_page() throws Throwable {
		scenario.write("Navigating Registration page");
        WebDriverWait wait = new WebDriverWait(driver,10);	 	    
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER"))).click();
	}

	@Then("^I enter my information$")
	public void i_enter_my_information(List<UserData> details) throws Throwable {
	   System.out.println("This is the form");
	   scenario.write("Entering User Registration Details");
	   System.out.println("Total users :"+details.size());
	   for(UserData user :details)
    {					 		 
       System.out.println("Registering :"+user.getFirstName()+" "+user.getLastName());
       driver.findElement(By.cssSelector("input[name*='firstName']")).sendKeys(user.getFirstName());
       driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys(user.getLastName());
       driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys(user.getPhone());
       driver.findElement(By.cssSelector("input[id*='userName']")).sendKeys(user.getEMail());
       driver.findElement(By.xpath("//input[@id='email'][@name='email']")).sendKeys(user.getUserName());
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(user.getPassword());
       driver.findElement(By.xpath("//input[starts-with(@name,'confirmP')]")).sendKeys(user.getConfirmPassword());
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
	
	
/**	@Then("^Click on Submit Button$")

	public void clickSubmit() throws Throwable 

	{

		driver.findElement(By.xpath("//input[contains(@src,'submit.gif')]")).click();

	}



	@Then("^Thank you for registering: should be displayed$")

	public void registerText() throws Throwable 

	{	

		String msg = driver.findElement(By.xpath("//*[contains(text(),'Thank you for registering')]")).getText();

	    System.out.println(msg);

	    Assert.assertTrue("Text is not getting displayed properly",msg.contains("Thank you for registering."));    

	}
***/

/**	@Then("^Click on Signoff$")

	public void clickSignOff() throws Throwable 

	{

		System.out.println("Clicking on ::"+driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).getText());

		driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).click();

	}
}
**/

