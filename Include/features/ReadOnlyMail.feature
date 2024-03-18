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

 
 @ReadOnly
Scenario Outline: This scenario for read olny mails 
    Given Mail conversation visible on the screen <name>
    When Mail is in unread mode <name>
    Then Click on the mail <name>
    Then Mail is in read mode <name>
    
     | name |
      | mail |    

@ReplyMail
Scenario Outline: This scenario for reply mails
    Given Mail conversation visible on the screen <name>
    When Mail is in unread mode <name>
    Then Click on the mail <name>
    Then Do the actions for reply/replyall <name>
    Then Mail is in read mode <name>

  
      | name |
      | mail |     
     