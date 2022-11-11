Feature: UI automation
  Scenario: Navigating to Contact us page
    When User navigates to "https://www.spectrum.net/" page
    And clicks to "Contact Us" page
    Then Spectrum contact page should open
