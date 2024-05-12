@B33G9-148
Feature: Verification of How To Use Pinbar functionality
  Agile story: As a user, I want to learn how to use the pinbar.


	#As a user, I want to learn how to use the pinbar.
	#Verify that when users click the “Learn how to use this space” link on the homepage, users see:
	#“How To Use Pinbar” and “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”
  @B33G9-145
  Scenario Outline: US003AC01TC01 Verify that user is able to learn how to use the pinbar.
    Given the user logged in as "<userType>"
    When User locate and click it Learn how to use this space link
    Then User sees expected text on the new opened page
      | How To Use Pinbar                                                                         |
    Then User sees second expected text on the new opened page
      | Use pin icon on the right top corner of page to create fast access link in the pinbar. |

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


	#As a user, I want to learn how to use the pinbar.
	#Verify that users see an image on the page.
	#Expected: path of the picture: /bundles/oronavigation/images/pinbar-location.jpg
  @B33G9-146
  Scenario Outline: US003AC02TC01 Verify that user is able to learn how to use the pinbar.
    Given the user logged in as "<userType>"
    When User locate and click it Learn how to use this space link
    Then Verify that users sees an image on the page with expected path.
      | /bundles/oronavigation/images/pinbar-location.jpg |

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |