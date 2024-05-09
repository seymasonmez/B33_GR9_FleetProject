@US07
Feature: Verify that once the users launch on the Vehicles page,
  the users can see all the checkboxes as unchecked.

  @B33G9-165
  Scenario Outline:Verify Unchecked Checkboxes on Vehicles Page
Given User is logged in as "<userType>"
When User navigates to the Vehicles page
When User views the checkboxes on the page
Then All checkboxes unchecked state. No checkbox is pre-selected:

Examples:
| userType        |
| sales manager   |
| store manager   |

  @B33G9-166

  Scenario Outline: Verify Users Can Check the First Checkbox to Select All Cars
  Given User is logged in as "<userType>"
    When User navigates to the Vehicles page
    When User locates the first checkbox. User clicks the first checkbox.
    Then User can verify that all cars are selected.

    Examples:
      | userType        |
      | sales manager   |
      | store manager   |

  @B33G9-167
  Scenario Outline: Verify that users can select any car
    Given User is logged in as "<userType>"
    When User navigates to the Vehicles page
    When User locates the any checkbox. User clicks the any checkbox.
    Then The user can see that car are selected.

    Examples:
      | userType        |
      | sales manager   |
      | store manager   |