$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SingleAndMultipleUserData.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration In MecuryFlight Site",
  "description": "",
  "id": "user-registration-in-mecuryflight-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10303424633,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I ve\u0027 a valid set of data and access to the Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingleAndMultipleUserData.user_on_home_page()"
});
formatter.write("Navigating to Mercury Flight Demo Page");
formatter.result({
  "duration": 2263616718,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#DataTable for a single user data set using raw()"
    },
    {
      "line": 7,
      "value": "# @UserReg1 @Firefox"
    }
  ],
  "line": 8,
  "name": "Single user registration",
  "description": "",
  "id": "user-registration-in-mecuryflight-site;single-user-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Registration page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter valid data",
  "rows": [
    {
      "cells": [
        "first_name",
        "Demo1"
      ],
      "line": 11
    },
    {
      "cells": [
        "last_name",
        "Single"
      ],
      "line": 12
    },
    {
      "cells": [
        "phone",
        "347775755"
      ],
      "line": 13
    },
    {
      "cells": [
        "email",
        "demo@single.com"
      ],
      "line": 14
    },
    {
      "cells": [
        "username",
        "Demo1"
      ],
      "line": 15
    },
    {
      "cells": [
        "password",
        "demogate"
      ],
      "line": 16
    },
    {
      "cells": [
        "confirm_pwd",
        "demogate"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Thank you for registering: should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on the Signoff Button",
  "keyword": "Then "
});
formatter.match({
  "location": "SingleAndMultipleUserData.registration_page()"
});
formatter.write("Navigating Registration page");
formatter.result({
  "duration": 668141081,
  "status": "passed"
});
formatter.match({
  "location": "SingleAndMultipleUserData.i_enter_valid_data(DataTable)"
});
formatter.result({
  "duration": 2606184520,
  "status": "passed"
});
formatter.match({
  "location": "SingleAndMultipleUserData.click_on_the_submit_button()"
});
formatter.result({
  "duration": 2158223022,
  "status": "passed"
});
formatter.match({
  "location": "SingleAndMultipleUserData.thank_you_for_registration_should_be_displayed()"
});
formatter.result({
  "duration": 95775369,
  "status": "passed"
});
formatter.match({
  "location": "SingleAndMultipleUserData.Signoff()"
});
formatter.result({
  "duration": 256996571,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 1970360383,
  "status": "passed"
});
formatter.before({
  "duration": 8792609723,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I ve\u0027 a valid set of data and access to the Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingleAndMultipleUserData.user_on_home_page()"
});
formatter.write("Navigating to Mercury Flight Demo Page");
formatter.result({
  "duration": 2097655685,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "#Using Hash Map in DataTable"
    },
    {
      "line": 23,
      "value": "#@UserReg2"
    }
  ],
  "line": 24,
  "name": "Multiple user registration",
  "description": "",
  "id": "user-registration-in-mecuryflight-site;multiple-user-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Registration page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I enter valid data on registration page and verify post-registration",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "phone",
        "email",
        "username",
        "password",
        "confirm_pwd"
      ],
      "line": 27
    },
    {
      "cells": [
        "Demo1",
        "Single1",
        "0789644111",
        "demo1@single.com",
        "Demo1",
        "demogate",
        "demogate"
      ],
      "line": 28
    },
    {
      "cells": [
        "Demo2",
        "Single2",
        "0789644222",
        "demo2@single.com",
        "Demo2",
        "demogate1",
        "demogate1"
      ],
      "line": 29
    },
    {
      "cells": [
        "Demo3",
        "Single3",
        "0789644333",
        "demo3@single.com",
        "Demo3",
        "demogate1",
        "demogate1"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SingleAndMultipleUserData.registration_page()"
});
formatter.write("Navigating Registration page");
formatter.result({
  "duration": 518411694,
  "status": "passed"
});
formatter.match({
  "location": "SingleAndMultipleUserData.enter_valid_data_verify_post_registration(DataTable)"
});
formatter.write("Entering Registration Data");
formatter.result({
  "duration": 11505335668,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 1318706947,
  "status": "passed"
});
formatter.before({
  "duration": 9709798166,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I ve\u0027 a valid set of data and access to the Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "SingleAndMultipleUserData.user_on_home_page()"
});
formatter.write("Navigating to Mercury Flight Demo Page");
formatter.result({
  "duration": 1948051311,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 32,
      "value": "#Using POJO in DataTable"
    }
  ],
  "line": 33,
  "name": "Multiple User Registration using POJO",
  "description": "",
  "id": "user-registration-in-mecuryflight-site;multiple-user-registration-using-pojo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "Registration page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I enter valid data on registration page and check if registration is successfull",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "phone",
        "email",
        "username",
        "password",
        "confirm_pwd"
      ],
      "line": 36
    },
    {
      "cells": [
        "Demo1",
        "Single1",
        "0789644111",
        "demo1@single.com",
        "Demo1",
        "demogate",
        "demogate"
      ],
      "line": 37
    },
    {
      "cells": [
        "Demo2",
        "Single2",
        "0789644222",
        "demo2@single.com",
        "Demo2",
        "demogate1",
        "demogate1"
      ],
      "line": 38
    },
    {
      "cells": [
        "Demo3",
        "Single3",
        "0789644333",
        "demo3@single.com",
        "Demo3",
        "demogate1",
        "demogate1"
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SingleAndMultipleUserData.registration_page()"
});
formatter.write("Navigating Registration page");
formatter.result({
  "duration": 608120729,
  "status": "passed"
});
formatter.match({
  "location": "SingleAndMultipleUserData.data_and_registration_success(UserData\u003e)"
});
formatter.result({
  "duration": 12221464274,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 1427465328,
  "status": "passed"
});
formatter.uri("mecuriyFlight.feature");
formatter.feature({
  "line": 1,
  "name": "Complete Registration Form",
  "description": "As a customer\r\nI want to complete my registration\r\nSo that I can login to the flight application",
  "id": "complete-registration-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9732233958,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Fill out registration with multiple rows of data",
  "description": "",
  "id": "complete-registration-form;fill-out-registration-with-multiple-rows-of-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on mecury flight site",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the regitration page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my information",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "phone",
        "email",
        "username",
        "password",
        "confirmpassword"
      ],
      "line": 10
    },
    {
      "cells": [
        "Aditya",
        "Roy",
        "7501451187",
        "a@text.com",
        "aditya91",
        "test123",
        "test123"
      ],
      "line": 11
    },
    {
      "cells": [
        "Rakesh",
        "Sinha",
        "7589866698",
        "b@rars.com",
        "rakesh90",
        "test123",
        "test123"
      ],
      "line": 12
    },
    {
      "cells": [
        "Preety",
        "Sharma",
        "8598745805",
        "preety@t.com",
        "preety18",
        "test123",
        "test123"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on Signoff",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 940457513,
  "status": "passed"
});
});