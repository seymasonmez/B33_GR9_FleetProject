@B33G9-148
Feature: Verification of How To Use Pinbar functionality


	#As a user, I want to learn how to use the pinbar.
	#Verify that when users click the “Learn how to use this space” link on the homepage, users see:
	#“How To Use Pinbar” and “Use the pin icon on the right top corner of page to createfast access link in the pinbar.”
	@B33G9-145
	Scenario Outline:   US003AC01TC01 Pinbar Feature
		Given User logged in under valid "<userType>" credentials
		When User locate and click it Learn how to use this space link
		Then User sees expected text on the new opened page 
		
		Examples: 
		|userType|
		|driver|
		|sales manager|
		|store manager|	


	#As a user, I want to learn how to use the pinbar.
	#Verify that users see an image on the page.
	#Expected: path of the picture: /bundles/oronavigation/images/pinbar-location.jpg
	@B33G9-146
	Scenario Outline: US003AC02TC01 Pinbar Feature
		Given User logged in under valid "<userType>" credentials
		When User locate and click it Learn how to use this space link
		Then Verify that users sees an image on the page with expected path. 
		
		Examples: 
		|userType|
		|driver|
		|sales manager|
		|store manager|