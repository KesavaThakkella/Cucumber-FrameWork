Feature: Free CRM Login Feature 
Scenario: Free CRM login scenario 
	Given user is in login page 
	When  titile of login page is Free CRM 
	Then  user enters "naveenk" and "test@123" 
	Then  close the browser 
	
Scenario Outline: Free CRM login scenario 
	Given user is in login page 
	When  titile of login page is Free CRM 
	Then  user enters "<username>" and "<password>" 
	Then  close the browser 
	
	Examples: 
	
		| username | password |
		| naveenk  | test@123 |