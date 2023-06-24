package com.testrun;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		    plugin = {"json:/Users/ahmchowdhury/eclipse-workspace/batch-34-final-framework/target/cucumber.json"}, // generate report location in .json format
	        features = {"/Users/ahmchowdhury/eclipse-workspace/batch-34-final-framework/src/test/resources/Online Banking Loging.feature"}, // feature file location
	        glue = {"com.generic"}, //stepdef package name
	        tags = "@Smoke"
		
		
		
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void setup() {
		
		
	}
	
	@Test
	public void Test1() {
		
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		
		
	}

}
