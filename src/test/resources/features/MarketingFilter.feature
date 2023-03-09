@login
Feature: Users should be able to login

  @wip1
  Scenario Outline:I want to manage filters on the Marketing page.

    Given the user logged in as "<user>"
    When the user hovers over marketing button
    Then the user clicks campaigns under marketing
    And the user clicks the manage filters button
    Then the user verifies five options are checked by default

    Examples:
      | user          |
      | store manager |
      | sales manager |


  @wip2
  Scenario Outline:I want to verify filters can be unchecked on filter page.

    Given the user logged in as "<user>"
    When the user hovers over marketing button
    Then the user clicks campaigns under marketing
    And the user clicks the manage filters button
    And the user uncheck one or more filter options
    Then the user verifies one or more options are unchecked

    Examples:
      | user          |
      | store manager |
      | sales manager |