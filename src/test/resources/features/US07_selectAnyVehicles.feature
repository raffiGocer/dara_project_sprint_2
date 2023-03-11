@alex 
Feature: "User should select any vehicle"
  As a user, I should be able to select any vehicle from the Vehicle page.

  Scenario Outline: "User view unchecked checkboxes on the Vehicle Page"
    Given the user logged in as "<user>"
    And Click the vehicle under the Fleet
    When user is on the Vehicle page
    Then all checkboxes on the Vehicle page are unchecked
    Examples:
      | user          |
      | store manager |
      | sales manager |


  Scenario Outline: "User click the first checkbox to check all checkboxes"
    Given the user logged in as "<user>"
    And Click the vehicle under the Fleet
    When user click the first checkbox in the web-table
    Then all check boxes are checked
    Examples:
      | user          |
      | store manager |
      | sales manager |

  Scenario Outline: "User check any car's checkboxes"
    Given the user logged in as "<user>"
    And Click the vehicle under the Fleet
    When user click any car checkbox
    Then checkbox is checked
    Examples:
      | user          |
      | store manager |
      | sales manager |
