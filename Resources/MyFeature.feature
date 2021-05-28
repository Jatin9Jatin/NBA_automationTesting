Feature: MyFeature

  Scenario: T1 (Site launch and close)
    Given launching NBA site
    When cookies accepted
    And close newsletter
    And NBA top-left icon clicked
    Then finish

  Scenario: T2 ()
    Given launching NBA site
    When lauching first story in all stories
    Then finish

    #lauching head to head
    #lauching league pass
    #lauching nba store
