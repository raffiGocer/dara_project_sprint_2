Feature: As a user, I should see error messages
  when I enter an invalid integer into the calendar repeat day input box.
@US09
  Scenario Outline:

Given the user logged in as "<role>"
When user selects and clicks Calendar Event under Activities module
And user clicks the Create Calendar Event button
And user clicks Repeat checkbox
And user enters any number less then "1"
Then user sees an "<The value have not to be less than 1>" error message is displayed

Examples:
|role         |
|driver       |
|sales manager|
|store manager|


Scenario Outline:

Given the user logged in as "<role>"
When user selects and clicks Calendar Event under Activities module
And user clicks the Create Calendar Event button
And user clicks Repeat checkbox
And user enters any number higher than "99"
Then user sees an "<The value have not to be more than 99>" error message is displayed

Examples:
|role         |
|driver       |
|sales manager|
|store manager|