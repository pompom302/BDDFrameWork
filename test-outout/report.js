$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/BDDFrameWork/src/main/java/features/dealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Data driven development with cucumber using datatables with Map for parameterization"
    }
  ],
  "line": 3,
  "name": "Free CRM create a new deal with mapping scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-with-mapping-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#enter data in table form exactly after declaration"
    }
  ],
  "line": 8,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "PayalModi",
        "PayalHenish"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "Title",
        "Amount",
        "Probability",
        "Commission"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "dealsMapStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 8819516400,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 46288900,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 765831800,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3529562000,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 8843300,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 1630995900,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 6227684700,
  "status": "passed"
});
formatter.match({
  "location": "dealsMapStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 766049000,
  "status": "passed"
});
});