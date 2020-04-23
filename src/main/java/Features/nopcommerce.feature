Feature: Nop commerce site testing 
Scenario: Testing the NOP Commerce site 
	Given if user is on admin area demo 
	When Enter email "admin@yourstore.com" and password "admin" 
	Then Click on login button 
	Then Click on sales and Orders tab 
	Then Get the order numbers from orders table 
	And Also get the data of customer from table 
	Then Get the Created On date from orders table 
	And Edit the order status pending for order 
	Then Download the pdf 
	And Attach a file in Order Notes section 
	Then Click on backbutton and select the Start date and End date