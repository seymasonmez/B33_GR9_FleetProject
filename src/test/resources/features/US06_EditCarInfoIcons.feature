Feature: Edit Car Info Icons Verification
  Agile Story : Verify that users see “view, edit, delete” options when they hover the mouse over the 3 dots “…”

  @B33G9-139
  Scenario Outline: Verify users can see "view, edit, delete" options when they hover the mouse over the 3 dots "..."

    Given the user logged in as "<userType>"
    When user hover mouse on Fleet Tab and click on Vehicles Module
    And user hover mouse over the three dots
    Then user verifies View, Edit and Delete options are displayed


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |