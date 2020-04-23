Feature: GTPL Bank New Customer Creation 


#without Examples Keyword
Scenario: GTPL Bank Customer Creation 

	Given user is already on Login Page 
	When title of login page is guru 
	Then enters "mngr228993" and "bUnYdYh" 
	Then user clicks on login button 
	Then clicks on new customer tab 
	Then enter customername "kesava Thakkella" 
	Then add address "2-15-4/1, mulugarthi nagana street, undiroad, Bhim" 
	
