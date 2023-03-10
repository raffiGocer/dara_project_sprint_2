 @login
Feature: As a user, I want to filter customer info on the Account page.

  Background: User is already in the log in page
    Given the user is on the login page
@wip
  Scenario Outline: Users should see 8 filter items on the Accounts page
    Given the user logged in as "<user>"
    When  user clicks the "Accounts" under the Customers
    Then user verify there are 8 filter options : Account Name, Contact Name,Contact Email, Contact Phone, Owner, Business Unit, Created At, Updated At


    Examples:
      |user|
      |sales manager|
      |store manager|

