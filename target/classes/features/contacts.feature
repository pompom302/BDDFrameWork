Feature: Free CRM create contacts
#Scenario Outline: is used only when Examples: keyword used, o.w. Scenario: is used
Scenario Outline: Free CRM create a new contact Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| username  | password    | firstname | lastname | position   |
	| PayalModi | PayalHenish | Henish    | Parekh   | Supervisor |
	| PayalModi | PayalHenish |	Piyu      | Jha      | Director   |
	| PayalModi | PayalHenish | Meet      | Patel    | Manager    |