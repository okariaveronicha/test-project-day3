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
@loginFeature
Feature: Login

  @test
  Scenario Outline: Logging in as an existing user
    Given user open web
    When user click my account button
    And user fill correct email <user> and password <pass>
    And user click login button    
    Then verify login success <verifying>

    Examples: 
      | user | pass | verifying  |
      | user123@phptravels.com | FGeui0Il9vvLqwyijXFuow== | success |