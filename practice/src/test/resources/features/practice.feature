#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Practice
Feature: Title of your feature
  I want to use this template for my feature file

  @Test1
  Scenario: Title of your scenario
    Given Login with user "gap-automation-test@mailinator.com" and pass "12345678"
    And Create Employee
    When Fill in formulary
    | First name | Last name | email               | Identification | leader name  | Year | Month | Day |
    | James			 | Smith     | jsmith@test.com     | 1234567890     | Andres Serna | 2014 |  1    | 21  |
    


