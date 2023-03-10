@US09 
Feature: As a user, I should see error messages
  when I enter an invalid integer into the calendar repeat day input box.

  Scenario Outline:

    Given the user logged in as "<role>"
    When user hover over the Activities button JT
    When user clicks the Calendar Event under the Activities button JT
    When user clicks the Create Calendar Event button JT
    And user checks the repeat checkbox JT
    And user clears the number 1 JT
    And user enters any number less then one,for example "-2"
    Then user sees an "The value have not to be less than 1." error message is displayed

    Examples:
      |role         |
      |sales manager|
      |store manager|
      #|driver       |

  Scenario Outline:

    Given the user logged in as "<role>"
    When user hover over the Activities button JT
    When user clicks the Calendar Event under the Activities button JT
    When user clicks the Create Calendar Event button JT
    And user checks the repeat checkbox JT
    And user enters any number higher than ninety nine, for example "100"
    Then user sees an "The value have not to be more than 99." error message is displayed

    Examples:
      |role         |
      |sales manager|
      |store manager|
      #|driver       |
