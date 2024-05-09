@B33G9-151
Feature: View vehicle odometer info feature

  Agile Story:
  As a user, I want to view car odometer info on the Vehicles Odometer page.

  Background: User is already in the login page
    Given the user is on the login page

  @B33G9-144
  Scenario Outline: Verify that <userType> see the error message “You do not have permission to perform this action.” when they click the Vehicle Odometer module.
    When the user logged in as "<userType>"
    When the user clicks to the Fleet module
    And the user clicks to the Vehicle Odometer module under the Fleet module
    Then the user should see the error message “You do not have permission to perform this action.”

    Examples:

      | userType     |
      | Sales Manager |
      | Store Manager |

  @B33G9-149
  Scenario: Verify that "Drivers" see the default page as 1.
    When the user logged in as "driver"
    When the user clicks to the Fleet module
    And the user clicks to the Vehicle Odometer module under the Fleet module
    Then the user verifies that they see the default page as "1".

  @B33G9-150
    Scenario: Verify that Drivers see the View Per Page as 25 by default.
      When the user logged in as "driver"
      When the user clicks to the Fleet module
      And the user clicks to the Vehicle Odometer module under the Fleet module
      Then the user verifies that they see the View Per Page as "25" by default.






