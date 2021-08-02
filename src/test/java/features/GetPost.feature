Feature:
  Verify different GET operations using REST-assured

  Scenario: Verify one author of post
    Given I perform GET operation for "/users"
    And I perform GET for the user number "1"
    Then I should see user name as "Raghav"

  Scenario: Verify collection of authors in the post
    Given I perform GET operation for "/users"
    Then I should see the author names