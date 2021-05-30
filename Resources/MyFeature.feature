Feature: MyFeature

  Scenario: T1 Site launch and close (validation & implicitlyWait)
    Given launching NBA site
    When cookies accepted
    And close newsletter
    And NBA top-left icon clicked
    Then finish

  Scenario: T2 open first story()
    Given launching NBA site
    And cookies accepted
    And close newsletter
    When launching first story in all stories
    Then finish

  Scenario: T3 launching head to head (Changing tabs)
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


  Scenario: T6 changing language to french (drive navigator)
    Given Getting on homepage
    When Changing language to french
    And getting back to previous page
    Then finish

  Scenario Outline: T7 launching state/province Team (Scenario outline + action class)
    Given Getting on homepage
    When Select state <team>
    And closing previous tab
    Then finish
    Examples:
      | team      |
      | Toronto   |
      #| New York  |
      #| Boston    |

  Scenario Outline: T8 Selecting country (Scenario outline + action class)
    Given Getting on homepage
    When Choose <country>
    And closing previous tab
    Then finish
    Examples:
      | country     |
      | Russia      |
      | Australia   |
      | France      |

      # India is not working

  Scenario: T9 launching team menu (creating list of similar element and clicking on our choice)
    Given Getting on homepage
    When open team list
    Then finish



# comments
  # stats,players,standing,kids

  # learn waits
  # api testing

