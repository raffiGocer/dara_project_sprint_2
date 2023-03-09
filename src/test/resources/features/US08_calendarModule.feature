Feature: As a user, I should be able to create a recurring calendar event

  @wipRFG
  Scenario Outline: User should see  the number 1 by default in the repeat every input
    Given the user logged in as "<user>"
    When user hover over the Activities button
    When user clicks the Calendar Event under the Activities button
    When user clicks the Create Calendar Event button
    And user checks the repeat checkbox
    Then user verifies the repeat number 1
    Examples:
    |user|
    |sales manager|
    |store manager|
    |driver       |

  @wipRFG
  Scenario Outline: User should see the error message "This value should not be blank."
  when the Calendar event repeat field is cleared(delete number 1)
    Given the user logged in as "<user>"
    When user hovers over the Activities button
    When user clicks the Calendar Event under the Activities button
    When user clicks the Create Calendar Event button
    And user checks the repeat checkbox
    And user clears the number 1
    Then user verifies the display message This value should not be blank.
    Examples:
      |user|
      |sales manager|
      |store manager|
      |driver       |

