Feature: US02 Access Oroinc Documentation Page by Clicking Question Mark Icon
Agile story: Verify that user access Oroinc Documentation page when clicking question mark icon

	#_*User Story:*_ As a user, I should access to the Oroinc Documentation page (Window handle)
	#
	#_*AC1:*_ Verify that users access to the Oroinc Documentation page by clicking the question mark icon.
	#
	#_*Test Objective:*_ To verify that users can access the Oroinc Documentation page by clicking the question mark icon and handle multiple windows.

  @B33G9-142
  Scenario Outline: US02AC01TC01 User access Oroinc Documentation page by clicking question mark icon
    Given the user logged in as "<userType>"
    When the user locate and click the question mark icon
    When the user should be redirected to the Oroinc Documentation page
    Then the user verify actual title as Oroinc Documentation page

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |