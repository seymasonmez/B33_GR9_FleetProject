Feature: Default

	#User StoryAs a user, I want to type into the Description field when I create a calendar event.
	#AC1:Verify that users can type messages in to the Description field on the Calendar Events page.

	@B33G9-140
	Scenario Outline: US010AC01TC01 Verify that users can type messages in to the Description field on the Calendar Events page.
		Given Given the user logged in as "<userType>"
				Given I am on the Calendar Events page
				When I click on the Create Calender Event
				And I click repeat checkbox
				And I type "Meeting with the project team at 3 PM" into the Description field
				Then the text "Meeting with the project team at 3 PM" should be visible in the Description field
		
					Examples:
					|userType|
				    |driver|
				    |sales manager|
				    |store manager|