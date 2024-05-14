@B33G9-174
Feature: Default

	@B33G9-160
	Scenario: US014AC01TC01 - Verify all 5 filter options visible
		Scenario Outline: US014AC01TC01 Verify that <userType> see all 5 filter options as checked by default and can uncheck any amount of filter options.
		    Given the user logged in as "<userType>"
		      When the user clicks on Campaign module under Marketing tab
		      When the user clicks to the filter icon
		      Then the user should see all 5 filter options checked by default
		
		    | Name |
		    | Code |
		    | Start Date |
		    | End Date |
		    | Budget |
		
		    Examples:
		      | userType |
		      | Sales Manager |
		      | Store Manager |	


	@B33G9-161
	Scenario: US014AC02TC01 - Verify that any amount of boxes can be unchecked
		Scenario Outline: US014AC02TC01 Verify that <userType> see all 5 filter options as checked by default and can uncheck any amount of filter options.
			Given the user logged in as "<userType>"
				When the user clicks on Campaign module under Marketing tab
				When the user clicks to the filter icon
				Then the user should be able to uncheck any amount of boxes

		    Examples:
		      | userType |
		      | Sales Manager |
		      | Store Manager |