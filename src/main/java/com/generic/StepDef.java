package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.page.object.model.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	ChromeDriver driver;
	@Given("Open the browser and go to application")
	public void open_the_browser_and_go_to_application() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ahmchowdhury/Downloads/dev_online%20Banking%20monthly_yearly%20statement.html");
	  
	}

	@When("put valid Username")
	public void put_valid_username() {
    driver.findElement(LoginPage.userName).sendKeys("Batch34");
	  
	}

	@When("put valid  Password")
	public void put_valid_password() {
		driver.findElement(LoginPage.passWord).sendKeys("student123@");
	  
	}

	@When("click Login button")
	public void click_login_button() {
		driver.findElement(LoginPage.logIn).click();
	  
	}

	@Then("Logout button should there")
	public void logout_button_should_there() {
    //Assertion-> soft assert and Hard assert two types we use soft assert
	//softassert all method are nonstatic thatswhy create object
		SoftAssert sf =new SoftAssert();
		
		driver.findElement(LoginPage.logOut).isDisplayed();
	    sf.assertAll();
	}

	@When("put invalid Username")
	public void put_invalid_username() {
		driver.findElement(LoginPage.userName).sendKeys("fssdgs");
	  
	}

	@When("put invalid  Password")
	public void put_invalid_password() {
		driver.findElement(LoginPage.passWord).sendKeys("fsdfas");
	  
	}

	@Then("alert message showed Invalid username or password")
	public void alert_message_showed_invalid_username_or_password() {
      //alert interface
	  Alert alert = driver.switchTo().alert();
	 String alertMsg= alert.getText();
	 SoftAssert sf = new SoftAssert();
	 sf.assertEquals(alertMsg, "Invalid username or password");
	}

	@When("put null Username")
	public void put_null_username() {
	driver.findElement(LoginPage.userName).sendKeys("");
	  
	}

	@When("put null Password")
	public void put_null_password() {
		driver.findElement(LoginPage.passWord).sendKeys("");
	  
	}
   


}
