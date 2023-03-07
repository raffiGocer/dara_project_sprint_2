@US10_AD
Feature: User should be able to write the “Description” when he creates a calendar event.

  @US10_AD_AC1
  Scenario Outline: verify that user is able to write messages in the Description field on the calendar event page
    Given the user logged in as "<user>"
    When user selects and clicks Calendar Event under Activities module on the home page
    And user clicks the Create Calendar Event button
    And user types  "Here is my text" in Description field
    Then user is able to see the text "Here is my text" in the Description field

    Examples:
      | user         |
      | driver        |
      | sales manager |
      | store manager |
