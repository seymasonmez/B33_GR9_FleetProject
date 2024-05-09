@B33G9-122
Feature: Accessing Main Modules of the App
  User Story: As a user, I should be accessing all the main modules of the app

  Scenario Outline: Store or Sales manager see 8 module names
    Given User logged in as "<userType>" with username "<username>" and password "<password>"
    When "<userType>" access the main modules of the app
    Then Store or Sales manager should see the following module names:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType      | username        | password    |
      | sales manager | salesmanager101 | UserUser123 |
      | store manager | storemanager51  | UserUser123 |


  Scenario Outline: Drivers see 4 module names
    Given User logged in as "<userType>" with username "<username>" and password "<password>"
    When "<userType>" access the main modules of the app
    Then Driver should see the following module names:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    Examples:
      | userType | username | password    |
      | driver   | user1    | UserUser123 |





