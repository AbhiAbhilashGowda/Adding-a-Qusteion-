package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:FeatureFiles/AddQuestion.feature",
		                      
}, 
glue = { "classpath:com.automation.stepdef"}, 
   monochrome = true,
   publish = true,
		   plugin = { "pretty", 
		   		"html:target/cucumber.html",
		   		"json:target/cucumber.json",
		   		"junit:target/cucumber.xml" })
				//tags=("not @Resume"))
public class Runner{
}

		   		 
 