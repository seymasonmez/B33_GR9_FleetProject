@B33G9-159
Feature:  Calendar Repeat Every Checkbox Functionality
  User Story :
  As a user, I should see error messages when I enter an invalid
  integer number into the calendar Repeat Every input box.
  @B33G9-157
  Scenario Outline: Verify that users see error messages when enter invalid integers.
    Given the user logged in as "<userType>"
    And user clicks on Calendar Events under Activities tab
    And user clicks on Create Calendar Event tab
    And checks the Repeat checkbox
    When user enters less than 1 in the calendar Repeat Every input box
    Then users should see “The value have not to be less than 1.”
    Examples:
      | userType |
      | driver    |
      | sales manager   |
      | store manager    |
  @B33G9-158
  Scenario Outline: Verify that users see error messages when enter invalid integers.
    Given the user logged in as "<userType>"
    And user clicks on Calendar Events under Activities tab
    And user clicks on Create Calendar Event tab
    And checks the Repeat checkbox
    When user enters more than 99 in the calendar Repeat Every input box
    Then users should see “The value have not to be more than 99.”
    Examples:
      | userType |
      | driver    |
      | sales manager   |
      | store manager    |

