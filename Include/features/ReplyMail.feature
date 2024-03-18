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
@tag
Feature: Mail feature
  I want to use this template for my feature file

 
     @tag1
    Scenario Outline: 
    Given Validate mail present on the screen<name>
    When Validate mail should be in unread mode
    Then Open the mail
    Then Validate whether mail having any attachments(audio files/pdf/images)
    Then Validate whether reply type 
    Then Validate Reply/ReplyAll buttons
    Then Validate Reply type as options/NLP
    Then Click on user response
    And Validate user response present on the screen
    Then Validate new response button
    Then New response having reply/ReplyAll buttons
    

    Examples: 
      | name  |value |
      | mail |  positive |
      