@Project @login
Feature: Shoppersstop Project
 @valid
  Scenario: Verify valid Login credential
    Given Launch browser
    And Load Shopperstop url
    When Enter into login page
    And Enter uesrname and password
    | email-id/mobile no | password  |
    | tamizh.jay@gmail.com |password |
    |9677823327 |password| 
    And Click login button
    Then Validate Logging in succesufully
    
  @invalid
  Scenario Outline: Verify valid Login credential
    Given Launch browser
    And Load Shopperstop url
    When Enter into login page
    And Enter "<username>" and "<password>"
     Then Login doesn't occur for invalid.

    Examples: 
    |username|password|
    |tamizh.jay@gmail.com| pass |
    #|tamizh.jay@gmail.com|pass12|
    #|tamizh.jay1@gmail|password|
    #| 9677823327 | pass |
   #|9677823327|password1|
    #| 9677823345 | password | 


     
