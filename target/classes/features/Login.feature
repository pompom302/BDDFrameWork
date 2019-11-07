#natural plug in is required for .feature files
Feature: Free CRM Login Feature

#without Examples keyword
#Scenario: Free CRM Login Test Scenario
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "PayalModi" and "PayalHenish"
#Then user clicks on login button
#Then user is on home page
#Scenario: user is able to create new contact
#Then user moves to new contact page
#Then user enters contact details "Henish" and "Parekh" and "Supervisor"
#Then Close the browser


#with Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
#Scenario: user is able to create new contact
Then user moves to new contact page
Then user enters contact details "Henish" and "Parekh" and "Supervisor"
Then Close the browser

Examples:
	| username  | password    |
	| PayalModi | PayalHenish |
	| naveenk   | test@123    |