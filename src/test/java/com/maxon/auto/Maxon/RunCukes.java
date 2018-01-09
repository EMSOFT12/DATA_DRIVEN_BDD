package com.maxon.auto.Maxon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		 
 features="src\\test\\resources",glue="com\\maxon\\auto\\stepdef", plugin="html:target/cucumber-report")
public class RunCukes {
}
