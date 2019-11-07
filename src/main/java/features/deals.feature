Feature: Deal data creation
#Data driven development with cucumber using tables
Scenario: Free CRM create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
#enter data in table form exactly after declaration
Then user enters username and password 
| PayalModi | PayalHenish |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details 
| test deal | 1000 | 50 | 10 |
Then Close the browser
