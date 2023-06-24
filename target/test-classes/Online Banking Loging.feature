@Smoke @Regression
Feature: Login function test

Description:

@Positive @TC_OB-4
Scenario: Check login with valid credentials

Given Open the browser and go to application
When put valid Username
When put valid  Password
When click Login button
Then  Logout button should there 


@Negative @TC_OB-6
Scenario: Check login with invalid credentials

Given Open the browser and go to application
When put invalid Username
When put invalid  Password
When click Login button
Then alert message showed Invalid username or password


@Negative @TC_OB-8
Scenario: Check login with null credentials

Given Open the browser and go to application
When put null Username
When put null Password
When click Login button
Then alert message showed Invalid username or password


