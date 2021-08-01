Feature: MyFeature2

  Scenario: T1 buying tshirt from store
    Given launching on homepage
    And launch nba store
    When Select a tshirt
    And buy the item
    Then finish


  Scenario: current test
    Given reaching last checkpoint
    When current test
    Then ongoing test

  Scenario: T2 buying hat from store
    Given launching on nba homepage
    And landing on nba store
    When Select a item from product listing
    And buy the selected item in the cart
    Then validating and closing the browser


  Scenario Outline:  T3 Checking out story copy link by story card number
    Given launching on nba homepage
    When open story number <num> and copying link
    Examples:
      | num |
      | 1 |

  Scenario Outline: T4 check score for selected team and select the game
    Given launching on nba homepage
    And open TV broardcast tab
    When Select team <Team>
    And Select date <Date>
    Examples:
      | Team | Date   |
      | TOR  |12/12/20|