Feature: login into  Application

Scenario: Positive test validation test

Given Initialize the browser with chrome 
And Navigate to "https://rahulshettyacademy.com/" site
And click on the login link in home page to land on sign-in page
When user enters "himanshu.b@cwsinfotech.com" and "123456" and logs in
Then verify user is successfully logged in