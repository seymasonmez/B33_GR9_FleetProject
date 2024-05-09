@B33G9-135
Feature: Default

  Scenario Outline: Verify that <userType> see all 5 filter options as checked by default and can uncheck any amount of filter options.
    Given User is logged in as "<userType>"
      When the user clicks to Marketing module
      And the user clicks to the Campaigns
      When the user clicks to the filter icon
      When the user should see all 5 filter options checked by default

    | Name |
    | Code |
    | Start Date |
    | End Date |
    | Budget |

      Then the user should be able to uncheck any amount of boxes

    Examples:
      | userType |
      | Sales Manager |
      | Store Manager |
