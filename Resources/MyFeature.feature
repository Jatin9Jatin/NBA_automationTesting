Feature: MyFeature

  Scenario: T1 (Site launch and close)
    Given launching NBA site
    When cookies accepted
    And close newsletter
    And NBA top-left icon clicked
    Then finish

  Scenario: T2 ()
    Given launching NBA site
    And cookies accepted
    And close newsletter
    When launching first story in all stories
    Then finish

  Scenario: T3 launching head to head

  Given Getting on homepage
  When opening head to head
  Then finish

  Scenario: T4 opening nba store

    Given Getting on homepage
    When opening nba store
    Then finish

  Scenario: T5 launching league pass

    Given Getting on homepage
    When launching league pass
    Then finish

