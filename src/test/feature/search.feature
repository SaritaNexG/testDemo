Feature:
  As a user I should be able to react and get appropriate result

  Backfround:
  Given I launch homepage of the url "//https:www.next.co.uk"
@Searchvalid @regression @smoke
    Scenario Outline: Verify search with valid product or brand name
    When I click on search field and enter the search term "<SearchTerm>"
    And I click on search icon
    Then I should see products related to "<ExpectedSearchTerm>" in search results page

  Examples:
  |SearchTerm|ExpectedSearchTerm|
  |Jeans     |jeans            |
  |Shirts    |  shirts         |

  @Searchinvalid @regression
    Given I launch homepage of the url "//https:www.next.co.uk"
    When I click on search field and enter the search term "grape21212121"
    And I click on search icon
    Then I should see products related to "no product or error message" in search results page