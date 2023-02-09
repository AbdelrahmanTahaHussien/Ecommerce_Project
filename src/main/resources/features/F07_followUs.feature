@smoke
  Feature: follow Us Scenarios
    Scenario: users opens facebook link
      When user click on the facebook button
      Then Url navigate to facebook "https://www.facebook.com/nopCommerce"
    Scenario: user opens twitter link
      When user click on the twitter button
      Then Url navigate to twitter "https://twitter.com/nopCommerce"
    Scenario: user opens rss link
      When user click on the rss button
      Then Url navigate to rss link "https://demo.nopcommerce.com/new-online-store-is-open"
    Scenario: user opens youtube link
      When user click on the youtube button
      Then Url navigate to the youtube link "https://www.youtube.com/user/nopCommerce"