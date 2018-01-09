package com.maxon.auto.abstractPage;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
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


public class AbstractPageStepDefinitions  {
	
	protected WebDriver driver;
	
	protected WebDriver getDriver(String browser){
		if(driver==null){
			if(browser.equals("Edge")){
			System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
			 driver = new EdgeDriver();
				
			}else if (browser.equals("Firefox")) {
	            driver = new FirefoxDriver();
	            driver.manage().window().maximize();
	        }

		}
		
		
		
		
		
		return driver;		
		
	}
	
	
	
	
	
	
}


