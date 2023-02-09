@smoke

Feature: Wishlist Feature
  Scenario: wishlist HTC success notification
        When user click on wishlist button on HTC
        Then Notification success message appeare in green color "#4bb07a"


  Scenario: opening wishlist to check the count
    When user click on wishlist button on HTC
    When user closes notification and click on wishlist
    Then check that qty is more than 0