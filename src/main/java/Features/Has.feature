Feature: Importing the created values into script from HashMap 

Scenario Outline: 
	Given I open the chrome browser 
	And I navigating to facebook website 
	Then Enter "<firstname>" and "<lastname>" 
	And Select month from month drop down 
	
	Examples: 
	
		|firstname|lastname|
		|kesava|subash|