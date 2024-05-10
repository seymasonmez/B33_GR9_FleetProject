@US08
Feature: Default

	#{color:#de350b}{*}User Story{*}:{color}
	# As a user, I want to create a recurring (repetitive) calendar event
	#
	#{color:#de350b}*AC #1:*{color}
	#Verify that users see the number “1” by default in the Repeat Every input option.
	#
	# 
  @B33G9-163

  Scenario Outline: Verify that users see the number “1” by default in the Repeat Every input option.
    Given the user logged in as "<userType>"
    Given User navigates to the calendar page
    Given the user is creating a new recurring event
    When user view the Repeat Every input option
    Then the default value displayed should be "1"
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  @B33G9-164

  Scenario Outline: Error message appears when Repeat Every field is cleared
    Given the user logged in as "<userType>"
    Given User navigates to the calendar page
    Given the user is creating a new recurring event
    When user view the Repeat Every input option
    When user clear the Repeat Every field
    Then user should see the error message "This value should not be blank."





    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |



