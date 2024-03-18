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
  This feature file validating mail type 

@ReadOnly
Scenario: Title of your scenario outline
    Given Mail conversation visible on the screen 
    When Mail is in unread mode 
    Then Click on the mail 
    Then Mail is in read mode 
    
    
@ReplyMail
Scenario: Title of your scenario outline
    Given Mail conversation visible on the screen
    When Mail is in unread mode
    Then Click on the mail
    Then Do the actions for reply and replyall 
    Then Mail is in read mode

    
    