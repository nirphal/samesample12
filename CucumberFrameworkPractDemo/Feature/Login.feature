Feature: Login 

Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://adactinhotelapp.com/" 
	And User enters Email as "Thippesh" and Password as "Thippesh" 
	And Click on Login 
	Then Page Title should be "Dashboard / Adactin Driving Innovation" 
	When User click on Log out link 
	Then Page Title should be "Click here to login again" 
	
