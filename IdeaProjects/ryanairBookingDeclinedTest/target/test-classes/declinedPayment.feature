@feature
Feature: Declined Booking

  @start
  Scenario: Specify booking details
    Given Ryanair start page is opened
    And search type 'Flights' is selected
    And From and To destinations are set
    And Fly out and fy back dates are set
    And number of passengers "2" is set
    When Let's go button pressed
    Then occurs redirection to booking Home Page


  Scenario: Select flights
    Given Booking home page is opened
#    When select return flights
#    When Continue button pressed
#    And popup disabled
#    Then occurs redirection to booking Extras Page

#  Scenario: Select journey extras
#    Given Booking extras page is opened
#    And "Check out" button is enabled
#    When "Check out" button pressed
#    Then occurs redirection to booking Payment Page
#
#    @stop
#  Scenario: Pay for flight
#    Given Booking payment page is opened
#    And total to pay is displayed
#    When title is set
#    And first name is set
#    And last name is set
#    And email address is set
#    And email address confirmation is set
#    And country is selected
#    And phone number is provided
#    And payment method is selected
#    And card number is set
#    And  card type is selected
#    And expiry month is selected
#    And expiry year is selected
#    And cvv code is set
#    And cardholder name is set
#    And address1 is set
#    And city is set
#    And terms&conditions are confirmed
#    And "Pay Now" button pressed
#    Then error occurs
