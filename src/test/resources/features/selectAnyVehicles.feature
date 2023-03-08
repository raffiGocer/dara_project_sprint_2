Feature: "User should select any vehicle"
  As a user, I should be able to select any vehicle from the Vehicle page.

  Background:
    Given Users are on the homepage
    And Click the vehicle under the Fleet

  Scenario:"User view unchecked checkboxes on the Vehicle Page"
    When user is on the Vehicle page
    Then all checkboxes on the Vehicle page are unchecked

  Scenario: "User click the first checkbox to check all checkboxes"
    When user click the first checkbox in the web-table
    Then all check boxes are checked

  Scenario: "User check any car's checkboxes"
    When user click any car checkbox
    Then checkbox is checked