$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search_product.feature");
formatter.feature({
  "line": 2,
  "name": "verifying search module of a Car Guruji site",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@parallelRunner"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "verify produt search",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Carguruji on \"\u003cbrowserName\u003e\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I coud vrify the page tile as \"\u003cpageTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logged in the site with user name as \"\u003cemailAddr\u003e\" password as \"\u003cpasswDdAddr\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify my  account title text as \"\u003cmyAccountTitleText\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I search for desired product as  \"\u003csearchProduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click to make product search",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verifyed the serched product as \"\u003cvrifyProduct\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search;",
  "rows": [
    {
      "cells": [
        "browserName",
        "pageTitle",
        "emailAddr",
        "passwDdAddr",
        "myAccountTitleText",
        "searchProduct",
        "vrifyProduct"
      ],
      "line": 19,
      "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search;;1"
    },
    {
      "cells": [
        "chrome",
        "CarGuruji Shop",
        "bfatogun@yahoo.com",
        "sonsofgod",
        "MY ACCOUNT",
        "blouse",
        "BLOUSE"
      ],
      "line": 20,
      "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search;;2"
    },
    {
      "cells": [
        "firefox",
        "CarGuruji Shop",
        "bfatogun@yahoo.com",
        "sonsofgod",
        "MY ACCOUNT",
        "blouse",
        "BLOUSE"
      ],
      "line": 21,
      "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 595000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "verify produt search",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@parallelRunner"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on Carguruji on \"chrome\" browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I coud vrify the page tile as \"CarGuruji Shop\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logged in the site with user name as \"bfatogun@yahoo.com\" password as \"sonsofgod\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify my  account title text as \"MY ACCOUNT\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I search for desired product as  \"blouse\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click to make product search",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verifyed the serched product as \"BLOUSE\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 22
    }
  ],
  "location": "SearchProductStepTest.i_am_on_Carguruji_on_browser(String)"
});
formatter.result({
  "duration": 23062139100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CarGuruji Shop",
      "offset": 31
    }
  ],
  "location": "SearchProductStepTest.i_coud_vrify_the_page_tile_as(String)"
});
formatter.result({
  "duration": 3520880400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bfatogun@yahoo.com",
      "offset": 40
    },
    {
      "val": "sonsofgod",
      "offset": 73
    }
  ],
  "location": "SearchProductStepTest.i_logged_in_the_site_with_user_name_as_password_as(String,String)"
});
formatter.result({
  "duration": 3808169599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY ACCOUNT",
      "offset": 36
    }
  ],
  "location": "SearchProductStepTest.i_verify_my_account_title_text_as(String)"
});
formatter.result({
  "duration": 69047301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "blouse",
      "offset": 34
    }
  ],
  "location": "SearchProductStepTest.i_search_for_desired_product_as(String)"
});
formatter.result({
  "duration": 196002300,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductStepTest.i_click_to_make_product_search()"
});
formatter.result({
  "duration": 2494231301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BLOUSE",
      "offset": 35
    }
  ],
  "location": "SearchProductStepTest.i_verifyed_the_serched_product_as(String)"
});
formatter.result({
  "duration": 40378901,
  "status": "passed"
});
formatter.after({
  "duration": 720001000,
  "status": "passed"
});
formatter.before({
  "duration": 83800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "verify produt search",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@parallelRunner"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on Carguruji on \"firefox\" browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I coud vrify the page tile as \"CarGuruji Shop\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logged in the site with user name as \"bfatogun@yahoo.com\" password as \"sonsofgod\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify my  account title text as \"MY ACCOUNT\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I search for desired product as  \"blouse\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click to make product search",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verifyed the serched product as \"BLOUSE\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 22
    }
  ],
  "location": "SearchProductStepTest.i_am_on_Carguruji_on_browser(String)"
});
