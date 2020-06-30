@Project @search
Feature: Shoppersstop Project
  
  @SearchEngine
  Scenario: Search by search engine
    Given load Url
    When search Items
    And select the product
    Then Verify product displays correctly
    And Add the product to cart

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
    ##  | Maybelline products |     5 | success |
      #| name2 |     7 | Fail    |
