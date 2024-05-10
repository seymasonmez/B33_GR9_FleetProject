Feature: Filter items on the Accounts page

	
	@B33G9-172
	# Scenario: US12_AC1_TC1 Verify that users see 8 filter items on the Accounts page.
		Scenario Outline:Verify that users see 8 filter items on the Accounts page:
		Given User is logged in as "<userType>"
			When user click to the account module under customers module
			When user click to filter icon
			Then user verifies that they can see 8 filter items on the Accounts page

		| Account Name |
		| Contact Name |
		|Contact Email |
		|Contact Phone |
		|Owner         |
		|Business Unit |
		|Created At    |
		|Updated At    |
		
		
		Examples:
		| userType        |
		| sales manager   |
		| store manager   |


