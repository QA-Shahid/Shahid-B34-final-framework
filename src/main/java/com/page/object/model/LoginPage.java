package com.page.object.model;

import org.openqa.selenium.By;

public class LoginPage {
    //PF=@FindBy
	//we doing POM =By
	
	// we using public access modifier to get access from other package.
	//another access modifier can get access from other package-> "private" but must be sub class/child class and need inheritance
	public static By userName = By.xpath("//*[@id=\"username\"]");
	public static By passWord = By.xpath("//*[@id=\"password\"]");
	public static By logIn = By.xpath("//*[@type=\"submit\"]");
	public static By logOut = By.xpath("//*[@id=\"logoutButton\"]");
	
}
