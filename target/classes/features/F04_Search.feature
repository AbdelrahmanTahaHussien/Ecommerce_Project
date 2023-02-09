
@smoke

Feature: User Search Feature


  Scenario Outline: User could search using product name

    When user enter Search item name as "<search>"
    Then displayed objects contains the search word "<search>"

    Examples:
    | search |
    | book    |
    | laptop    |
    | nike    |

  Scenario Outline: User could search using aku name

    When user enter Search item name as "<sku>"
    When user click on the item
    Then displayed objects contains the sku word "<sku>"

    Examples:
      | sku |
      | SCI_FAITH   |
      | APPLE_CAM    |
      | SF_PRO_11    |