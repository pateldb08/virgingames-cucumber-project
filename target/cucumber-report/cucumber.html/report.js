$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineslot.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Online Slots Category Test",
  "description": "\r\nAs a use I should be able to navigate to Online Slots page",
  "id": "homepage-online-slots-category-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4136940600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to online slots page successfully",
  "description": "",
  "id": "homepage-online-slots-category-test;user-should-navigate-to-online-slots-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I accept cookies",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Online Slots catagory",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to Online Slots category page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 101311500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAcceptCookies()"
});
formatter.result({
  "duration": 108019800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnOnlineSlotsCatagory()"
});
formatter.result({
  "duration": 127162300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldNavigateToOnlineSlotsCategoryPage()"
});
formatter.result({
  "duration": 608635900,
  "status": "passed"
});
});