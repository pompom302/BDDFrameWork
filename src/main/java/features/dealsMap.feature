Feature: Deal data creation
#Data driven development with cucumber using datatables with Map for parameterization
Scenario: Free CRM create a new deal with mapping scenario

Given user is already on Login Page
When title of login page is Free CRM
#enter data in table form exactly after declaration
Then user enters username and password 
| username | password |
| PayalModi | PayalHenish |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details 
| Title      | Amount | Probability | Commission |
| test deal1 |  1000  |     50      |     10     |
| test deal2 |  2000  |     60      |     20     |
| test deal3 |  3000  |     70      |     30     |
Then Close the browser
