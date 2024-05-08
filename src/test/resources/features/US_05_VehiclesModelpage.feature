
Feature: Viewing columns on the Vehicles Model page
  @US05_01
  Scenario Outline: Verify that <user_type> can see all necessary columns
    Given User is logged in as "<user_type>"
    When User navigates to the Vehicles Model page
    Then User should see the following columns:
      | Model Name               |
      | Make                     |
      | Can be requested         |
      | CVVI                     |
      | CO2 Fee (/month)         |
      | Cost (Depreciated)       |
      | Total Cost (Depreciated) |
      | CO2 Emissions            |
      | Fuel Type                |
      | Vendors                  |

    Examples:
      | user_type     |
      | store manager |
      | sales manager |
  @US05_02
  Scenario Outline: Verify that <user_type> can see all necessary columns
    Given User is logged in as "<user_type>"
    When I attempt to access the Vehicles Model page
    Then I should see the message "You do not have permission to perform this action."
    And I should not be able to access the Vehicles Model page

    Examples:
      | user_type |
      | driver    |
