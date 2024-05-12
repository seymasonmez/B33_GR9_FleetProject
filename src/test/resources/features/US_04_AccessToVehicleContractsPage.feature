Feature: Access to Vehicle contracts page
#US4-     As a user, I want to access to Vehicle contracts page
#AC1: Verify that Store managers and Sales managers can access the Vehicle Contracts page.
	
	@B33G9-153
	Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle Contracts page.
		Given User is logged in as "<user_type>"

		    When user hover mouse on Fleet Tab and click on Vehicle Contracts
		          #  When user click Fleet
		           # And  click Vehicle Contracts
		            Then user should be at expected Url
		 
		    Examples:
		      | user_type      |
		      | store manager  |
		      | sales manager  |



	#Given User is logged in as "Driver"
	#            When the user clicks Fleet
	#            and  click Vehicle Contracts
	#            then the user should see the message
	@B33G9-173
	Scenario Outline: Verify that Drivers can NOT access the Vehicle Contracts
		Given User is logged in as <userType>
		When user hover mouse on Fleet Tab and click on Vehicle Contracts
		Then user should see the error message
		Examples:
			| userType |
			| "Driver" |

		 # expectedMessage :“You do not have permission to perform this action.”