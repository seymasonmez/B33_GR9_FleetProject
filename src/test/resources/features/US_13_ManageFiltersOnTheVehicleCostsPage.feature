@wip13
  Feature: I want to manage filters on the Vehicle Costs page. (Web table and checkbox)


  Scenario Outline: US13TC1 verify that users can see 3 columns on the vehicle page
    Given the user logged in as "<userType>"
    And the user navigates to "Fleet" to "Vehicle Costs"
    Then user should see three columns under vehicle costs
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | userType      |
      | Sales Manager |
      | Store Manager |


    Scenario Outline: us13TC2 verify that users can check the first checkBox to select all vehicle costs
      Given the user logged in as "<userType>"
      And the user navigates to "Fleet" to "Vehicle Costs"
      Then user click the first checkBox
      And all checkBox should be selected


      Examples:
        | userType      |
        | Sales Manager |
        | Store Manager |




