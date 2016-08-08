$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("declinedPayment.feature");
formatter.feature({
  "line": 2,
  "name": "Declined Booking",
  "description": "",
  "id": "declined-booking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature"
    }
  ]
});
formatter.before({
  "duration": 29885004491,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Specify booking details",
  "description": "",
  "id": "declined-booking;specify-booking-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@start"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Ryanair start page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "search type \u0027Flights\u0027 is selected",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "From and To destinations are set",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Fly out and fy back dates are set",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "number of passengers \"2\" is set",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Let\u0027s go button pressed",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "occurs redirection to booking Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "DeclinedBookingSteps.ryanair_start_page_is_opened()"
});
formatter.result({
  "duration": 1507196025,
  "status": "passed"
});
formatter.match({
  "location": "DeclinedBookingSteps.search_type_Flights_is_selected()"
});
formatter.result({
  "duration": 301591575,
  "status": "passed"
});
formatter.match({
  "location": "DeclinedBookingSteps.destination_is_set()"
});
formatter.result({
  "duration": 6645364186,
  "status": "passed"
});
formatter.match({
  "location": "DeclinedBookingSteps.is_set()"
});
formatter.result({
  "duration": 14106794807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "DeclinedBookingSteps.number_of_passengers_is_set(String)"
});
formatter.result({
  "duration": 7294843187,
  "status": "passed"
});
formatter.match({
  "location": "DeclinedBookingSteps.button_pressed()"
});
formatter.result({
  "duration": 17502184537,
  "status": "passed"
});
formatter.match({
  "location": "DeclinedBookingSteps.occurs_redirection_to_booking_Home_Page()"
});
formatter.result({
  "duration": 3000458601,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Select flights",
  "description": "",
  "id": "declined-booking;select-flights",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Booking home page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "DeclinedBookingSteps.booking_home_page_is_opened()"
});
formatter.result({
  "duration": 292516,
  "status": "passed"
});
});