Feature: Accessing the vehicle odometer page

@wip1
  Scenario Outline: Managers should see an error message when they click Vehicle Odometer module
    Given the user logged in as "<user>"
    When users hover over the Fleet
    When users click the Vehicle Odometers under Fleet
    Then users verify managers see You do not have permission to perform this action
    Examples:
      | user          |
      | store manager |
      | sales manager |

@wip2
  Scenario: Driver should see the default page number one
    Given the user logged in as "driver"
    When users hover over the Fleet on driver dashboard
    When users click the Vehicle Odometers under driver Fleet
    Then users verify the default page number is one

@wip3
  Scenario: Driver should see the default view page is twentyFive
    Given the user logged in as "driver"
    When users hover over the Fleet on driver dashboard
    When users click the Vehicle Odometers under driver Fleet
    Then users verify the default view per page is twentyFive
