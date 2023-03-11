@smoke
Feature: As a user, I should manage filters on the Vehicle Costs page.

  @wipIK
  Scenario Outline: Users should see 3 columns on the Vehicle Model page.
    Given the user logged in as "<user>"
    When user hover over the Fleet button
    Then user clicks the Vehicle Cost button under the Fleet button
    Then user verify there are three columns in the table
    Examples:
      | user          |
      | sales manager |
      | store manager |
      | driver        |


    @wipIK
    Scenario Outline: Users select all the vehicle costs
      Given the user logged in as "<user>"
      When user hover over the Fleet button
      Then user clicks the Vehicle Cost button under the Fleet button
      And user clicks the first checkbox
      Then user verify all the vehicle costs are checked
      Examples:
        | user          |
        | sales manager |
        | store manager |
        
